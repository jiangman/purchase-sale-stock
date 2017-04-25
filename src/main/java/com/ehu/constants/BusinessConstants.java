package com.ehu.constants;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-24 14:35.
 */
public interface BusinessConstants {
    /** 用户被禁用 */
    String USER_PROHIBIT = "0";

    /**
     * 进销存用户redis存储的key的前部分
     */
    String STOCK_USER_KEY_HEAD = "STOCK_USER_";

    /**
     * 未删除
     */
    int DEL_FLAG_UNDEL = 0;

    /**
     * 已删除
     */
    int DEL_FLAG_DEL = 1;
}
