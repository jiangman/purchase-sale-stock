package com.ehu.bean.business;

import lombok.Data;

import java.math.BigDecimal;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-05-05 14:01.
 */
@Data
public class SupplierGoodsBean {
    private String supplierName;

    private String goodsName;

    private int orderQuantity;

    private BigDecimal goodsPrice;
}
