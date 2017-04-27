package com.ehu.service;

import com.ehu.bean.UserToken;
import com.ehu.bean.request.LoginRequest;
import com.ehu.bean.response.SystemMenu;
import com.ehu.constants.BusinessConstants;
import com.ehu.constants.ErrorMessageConstants;
import com.ehu.constants.SystemConstants;
import com.ehu.exceptions.LoginValidationException;
import com.ehu.mapper.SysUserMapper;
import com.ehu.mapper.TMerchantUserInfoMapper;
import com.ehu.mapper.TMerchantUserMapper;
import com.ehu.model.SysUser;
import com.ehu.model.TMerchantUser;
import com.ehu.model.TMerchantUserInfo;
import com.ehu.util.MathUtil;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-24 14:17.
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private TMerchantUserMapper merchantUserMapper;

    @Autowired
    private TMerchantUserInfoMapper merchantUserInfoMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     *
     *
     * @param request
     * @return
     * @throws LoginValidationException
     */
    public Object login(LoginRequest request) throws LoginValidationException {
        UserToken userToken = new UserToken();
        SysUser query = new SysUser();
        query.setUserAccount(request.getUserAccount());
        SysUser sysUser = userMapper.selectOne(query);
        if (sysUser == null) {
            // 如果用户查询不到，则到商家端表查询用户信息，给予相同的逻辑处理
            if (StringUtils.isNumeric(request.getUserAccount())) {
                TMerchantUser merchantUserQuery = new TMerchantUser();
                merchantUserQuery.setPhone(Long.valueOf(request.getUserAccount()));
                TMerchantUser merchantUser = merchantUserMapper.selectOne(merchantUserQuery);
                if (merchantUser == null) {
                    throw new LoginValidationException(ErrorMessageConstants.NO_SUCH_USER);
                } else {
                    if (!request.getUserPassword().equals(merchantUser.getPassWord())) {
                        throw new LoginValidationException(ErrorMessageConstants.UNCORRECT_PWD);
                    }
                    String token = MathUtil.getToken();
                    redisTemplate.opsForValue().set(BusinessConstants.STOCK_USER_KEY_HEAD + merchantUser.getPhone(), token, BusinessConstants.EXPIRE_TIME, TimeUnit.HOURS);
                    userToken.setUserName(merchantUser.getRealName());
                    userToken.setMerchant(true);
                    userToken.setToken(token);
                    userToken.setUserAccount(request.getUserAccount());
                    TMerchantUserInfo merchantUserInfo = new TMerchantUserInfo();
                    merchantUserInfo.setMuid(merchantUser.getGuid());
                    userToken.setMerchantId(merchantUserInfoMapper.selectOne(merchantUserInfo).getSmiid());
                    // 用户信息暂存redis
                    redisTemplate.opsForValue().set(token, userToken, BusinessConstants.EXPIRE_TIME, TimeUnit.HOURS);
                    return userToken;
                }
            } else {
                throw new LoginValidationException(ErrorMessageConstants.NO_SUCH_USER);
            }
        }
        if (BusinessConstants.USER_PROHIBIT.equals(sysUser.getUserStatus())) {
            throw new LoginValidationException(ErrorMessageConstants.USER_PROHIBIT);
        }
        if (!request.getUserPassword().equals(sysUser.getUserPassword())) {
            throw new LoginValidationException(ErrorMessageConstants.UNCORRECT_PWD);
        }
        String token = MathUtil.getToken();
        redisTemplate.opsForValue().set(BusinessConstants.STOCK_USER_KEY_HEAD + sysUser.getUserAccount(), token, BusinessConstants.EXPIRE_TIME, TimeUnit.HOURS);
        BeanUtils.copyProperties(sysUser, userToken);
        userToken.setToken(token);
        userToken.setMenus(getMenuTree(sysUser.getId()));
        // 用户信息暂存redis
        redisTemplate.opsForValue().set(token, userToken, BusinessConstants.EXPIRE_TIME, TimeUnit.HOURS);
        return userToken;
    }

    private List<SystemMenu> getMenuTree(int userId) {
        List<SystemMenu> menus = userMapper.getUserMenus(userId);
        List<SystemMenu> parentMenus = Lists.newArrayList(Collections2.filter(menus, new Predicate<SystemMenu>() {
            @Override
            public boolean apply(SystemMenu systemMenu) {
                return systemMenu.getParentCode() == 1;
            }
        }));
        for (SystemMenu menu : parentMenus) {
            menu.setSubMenu(getChildMenus(menu.getMenuCode(), menus));
        }
        return parentMenus;
    }

    private List<SystemMenu> getChildMenus(int menuCode, List<SystemMenu> menus) {
        List<SystemMenu> childMenus = Lists.newArrayList();
        for (SystemMenu menu : menus) {
            if (menu.getParentCode() == menuCode) {
                childMenus.add(menu);
            }
        }

        for (SystemMenu menu : childMenus) {
            menu.setSubMenu(getChildMenus(menu.getMenuCode(), menus));
        }

        if (childMenus.size() == 0) {
            return null;
        }
        return childMenus;
    }

    /**
     * 注销登录
     */
    public void logout() {
        redisTemplate.delete(BusinessConstants.STOCK_USER_KEY_HEAD + SystemConstants.USER_TOKEN.getUserAccount());
        redisTemplate.delete(SystemConstants.USER_TOKEN.getToken());
    }
}
