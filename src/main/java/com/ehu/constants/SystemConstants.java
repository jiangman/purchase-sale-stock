package com.ehu.constants;

import com.ehu.model.SysUser;

/**
 * 系统全局参数常量类.
 *
 * @author demon
 * @since 2017-03-08 14:59.
 */
public class SystemConstants {
    public static SysUser USER_TOKEN = null;

    /** swagger url */
    public static final String[] DO_NOT_INTERCEPT_URLS = {"/configuration/ui", "/swagger-resources", "/v2/api-docs", "/configuration/security"};
}
