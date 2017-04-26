package com.ehu.bean.response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 分页response.
 *
 * @author demon
 * @since 2017-04-26 14:03.
 */
@Data
@AllArgsConstructor
public class PageResponse {
    private Object items;

    private int totalCount;
}
