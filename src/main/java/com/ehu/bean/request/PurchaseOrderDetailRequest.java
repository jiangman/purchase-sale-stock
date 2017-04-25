package com.ehu.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 10:24.
 */
@Data
@ApiModel
public class PurchaseOrderDetailRequest {
    @ApiModelProperty("商品id")
    private int goodsId;

    @ApiModelProperty("商品名称")
    private String goodsName;

    @ApiModelProperty("订单数量")
    private int orderQuantity;

    @ApiModelProperty("实收数量")
    private int actualQuantity;

    @ApiModelProperty("预计单价")
    private BigDecimal orderPrice;

    @ApiModelProperty("实际单价")
    private BigDecimal actualPrice;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("箱规")
    private String standard;
}
