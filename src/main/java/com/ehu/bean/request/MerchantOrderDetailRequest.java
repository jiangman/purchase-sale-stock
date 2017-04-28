package com.ehu.bean.request;

import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-28 17:15.
 */
@Data
public class MerchantOrderDetailRequest {
    private int firstMenuId = 0;

    private int secondMenuId = 0;

    private int orderId;
}
