package com.ehu.constants;

import com.ehu.bean.UserToken;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 系统全局参数常量类.
 *
 * @author demon
 * @since 2017-03-08 14:59.
 */
public class SystemConstants {
    /** swagger url */
    public static final String[] SWAGGER_URLS = {"/configuration/ui", "/swagger-resources", "/v2/api-docs", "/configuration/security"};

    public static final List<String> UN_INTERCPT_URLS = Lists.newArrayList("/v2/*", "/user/login", "/swagger-ui.html",
            "/configuration/ui", "/swagger-resources", "/configuration/security",
            "/druid/*", "/orders/downloadExcel", "/orders/downloadOrdersExcel");
    /**
     * 登录token缓存key(商家端登录token头部)
     */
    public static final String TOKEN_KEY = "MCT_101_";
    public static UserToken USER_TOKEN = new UserToken();
}
