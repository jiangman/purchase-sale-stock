package com.ehu.interceptor;

import com.ehu.constants.ErrorMessageConstants;
import com.ehu.constants.SystemConstants;
import com.ehu.exceptions.LoginValidationException;
import com.ehu.model.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class TokenInterceptor extends HandlerInterceptorAdapter {
    private RedisTemplate<String, SysUser> redisTemplate;

    public TokenInterceptor(RedisTemplate<String, SysUser> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 在业务处理器处理请求之前被调用
     * 如果返回false
     * 从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链
     * <p>
     * 如果返回true
     * 执行下一个拦截器,直到所有的拦截器都执行完毕
     * 再执行被拦截的Controller
     * 然后进入拦截器链,
     * 从最后一个拦截器往回执行所有的postHandle()
     * 接着再从最后一个拦截器往回执行所有的afterCompletion()
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        log.info("-----------------------------check token-----------------------------");
        String token = request.getHeader("token");
        if (token == null) {
            throw new LoginValidationException(ErrorMessageConstants.ILLEGAL_TOKEN);
        }
        SysUser sysUser = redisTemplate.opsForValue().get(token);
        if (sysUser == null) {
            throw new LoginValidationException(ErrorMessageConstants.ILLEGAL_TOKEN);
        }
        BeanUtils.copyProperties(sysUser, SystemConstants.USER_TOKEN);
        SystemConstants.USER_TOKEN.setToken(token);
        return true;
    }
}
