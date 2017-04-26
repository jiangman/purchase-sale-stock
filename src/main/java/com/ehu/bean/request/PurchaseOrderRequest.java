package com.ehu.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 10:18.
 */
@Data
@ApiModel
public class PurchaseOrderRequest {
    @ApiModelProperty("采购订单id，新增时不需要传")
    private int purchaseOrderId;

    @ApiModelProperty("商家id")
    private int merchantId;

    @ApiModelProperty("负责人")
    private String personInCharge;

    @ApiModelProperty("订单总价")
    private BigDecimal orderTotalPrice;

    @ApiModelProperty("订单实收金额")
    private BigDecimal orderActualPrice;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("供应商id")
    private int supplierId;

    @ApiModelProperty("删除标识(0:正常， 1:已删除)")
    private int delFlag = 0;

    @ApiModelProperty("付款状态(0:未付款，1:已付款)")
    private int payStatus = 0;

    @ApiModelProperty("审核状态(0:未审核，1:审核通过，2:驳回)")
    private int verifyStatus = 0;

    @ApiModelProperty("采购订单详情")
    private List<PurchaseOrderDetailRequest> details = new ArrayList<>();
}
