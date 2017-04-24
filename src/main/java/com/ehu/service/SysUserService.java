package com.ehu.service;

import com.ehu.bean.UserToken;
import com.ehu.bean.request.LoginRequest;
import com.ehu.constants.BusinessConstants;
import com.ehu.constants.ErrorMessageConstants;
import com.ehu.constants.SystemConstants;
import com.ehu.exceptions.LoginValidationException;
import com.ehu.mapper.SysUserMapper;
import com.ehu.model.SysUser;
import com.ehu.util.MathUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

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
    private RedisTemplate<String, SysUser> redisTemplate;

    /**
     *
     *
     * @param request
     * @return
     * @throws LoginValidationException
     */
    public Object login(LoginRequest request) throws LoginValidationException {
        SysUser sysUser = userMapper.queryUserByAccount(request.getUserAccount());
        if (sysUser == null) {
            throw new LoginValidationException(ErrorMessageConstants.NO_SUCH_USER);
        }
        if (BusinessConstants.USER_PROHIBIT.equals(sysUser.getUserStatus())) {
            throw new LoginValidationException(ErrorMessageConstants.USER_PROHIBIT);
        }
        if (!request.getUserPassword().equals(sysUser.getUserPassword())) {
            throw new LoginValidationException(ErrorMessageConstants.UNCORRECT_PWD);
        }
        String token = MathUtil.getToken();
        redisTemplate.opsForValue().set(token, sysUser);
        UserToken userToken = new UserToken();
        BeanUtils.copyProperties(sysUser, userToken);
        userToken.setToken(token);
        return userToken;
    }

    /**
     * 注销登录
     */
    public void logout() {
        redisTemplate.delete(SystemConstants.USER_TOKEN.getToken());
    }
}
