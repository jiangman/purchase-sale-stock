package com.ehu.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 进行权限验证.
 *
 * @author demon
 * @since 2017-04-25 10:02.
 */
@Slf4j
public class PermissionInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("-----------------start permission check-----------------------");
        return true;
    }
}
