package com.ehu.interceptor;

import com.ehu.bean.UserToken;
import com.ehu.constants.BusinessConstants;
import com.ehu.constants.ErrorMessageConstants;
import com.ehu.constants.SystemConstants;
import com.ehu.exceptions.LoginValidationException;
import com.ehu.model.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class TokenInterceptor extends HandlerInterceptorAdapter {
//    private static String un_login;

    private RedisTemplate redisTemplate;

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
        String guid = request.getHeader("guid");
        if (StringUtils.isEmpty(guid)) {
            if (token == null) {
                throw new LoginValidationException(ErrorMessageConstants.ILLEGAL_TOKEN);
            }
            Object userToken = redisTemplate.opsForValue().get(token);
            if (userToken == null) {
                throw new LoginValidationException(ErrorMessageConstants.ILLEGAL_TOKEN);
            }
            String redisToken = (String) redisTemplate.opsForValue().get(BusinessConstants.STOCK_USER_KEY_HEAD + ((UserToken) userToken).getUserAccount());
            if (!token.equals(redisToken)) {
                throw new LoginValidationException(ErrorMessageConstants.ILLEGAL_TOKEN);
            }
            SystemConstants.USER_TOKEN = (UserToken) userToken;
        } else {
            String loginToken = getValueFromJedis(SystemConstants.TOKEN_KEY + Integer.parseInt(guid));
            if (loginToken == null || !loginToken.equals(token)) {
                throw new LoginValidationException(ErrorMessageConstants.ILLEGAL_TOKEN);
            } else {
                return true;
            }
        }
        return true;
    }

//    /**
//     * 用户未登录
//     *
//     * @param response
//     * @throws IOException
//     */
//    private void unLogin(HttpServletResponse response) throws IOException {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("application/json; charset=utf-8");
//        PrintWriter out = null;
//        try {
//            out = response.getWriter();
//            out.append(un_login);
//            out.flush();
//        } finally {
//            if (out != null) {
//                out.close();
//            }
//        }
//    }

    /**
     * 获取key，用于兼容之前使用的jedis，由于之前在store的时候并没有使用序列化，
     * 所以valueOperations不能正常获取到value，所以使用这个方法，之后的不需要
     *
     * @param key
     * @return
     */
    public String getValueFromJedis(String key) {
        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        byte[] resultBytes = connection.get(key.getBytes());
        String result = null;
        if (resultBytes != null) {
            result = new String(resultBytes);
        }
        connection.close();
        return result;
    }
}
