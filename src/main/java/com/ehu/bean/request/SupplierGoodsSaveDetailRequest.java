package com.ehu.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-26 14:32.
 */
@ApiModel
@Data
public class SupplierGoodsSaveDetailRequest {
    @ApiModelProperty("供应商id")
    private Integer supplierId;

    /**
     * 规格
     */
    @ApiModelProperty("规格")
    private String standard;

    /**
     * 规格数量
     */
    @ApiModelProperty("规格数量")
    private Integer standardValue;

    /**
     * 最小起订数量
     */
    @ApiModelProperty("最小起订数量")
    private Integer minOrderQuantity;

    /**
     * 成本价
     */
    @ApiModelProperty("成本价")
    private BigDecimal costPrice;

    /**
     * 商品库商品id
     */
    @ApiModelProperty("商品库商品id")
    private Integer sgiid;

    /**
     * 删除标识(0:正常， 1:已删除)
     */
    @ApiModelProperty("删除标识(0:正常， 1:已删除)")
    private Integer delFlag = 0;
}
