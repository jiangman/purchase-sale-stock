package com.ehu.util;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-03-15 15:10.
 */
public class StringUtils {
    /**
     * 判断是否包含数组中的字符串
     *
     * @param source
     * @param urls
     * @return
     */
    public static boolean contains(String source, String[] urls) {
        for (String url : urls) {
            if (source.contains(url)) {
                return true;
            }
        }

        return false;
    }
}
