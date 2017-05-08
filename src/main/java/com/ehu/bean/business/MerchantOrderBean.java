package com.ehu.bean.business;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-05-08 9:31.
 */
@Data
public class MerchantOrderBean {
    private int purchaseOrderId;

    private String merchantName;

    private String goodsName;

    private int orderQuantity;

    private BigDecimal orderPrice;

    private Date orderTime;
}
