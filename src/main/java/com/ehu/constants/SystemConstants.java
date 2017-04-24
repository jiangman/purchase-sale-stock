package com.ehu.constants;

import com.ehu.bean.UserToken;

/**
 * 系统全局参数常量类.
 *
 * @author demon
 * @since 2017-03-08 14:59.
 */
public class SystemConstants {
    /** swagger url */
    public static final String[] DO_NOT_INTERCEPT_URLS = {"/configuration/ui", "/swagger-resources", "/v2/api-docs", "/configuration/security"};
    public static UserToken USER_TOKEN = null;
}
