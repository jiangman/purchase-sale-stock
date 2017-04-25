package com.ehu.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 10:43.
 */
@Data
@ApiModel
public class SupplierRequest {
    @ApiModelProperty("供应商id, 新增时不需要传")
    private Integer supplierId;

    @ApiModelProperty("供应商名称")
    private String supplierName;

    @ApiModelProperty("供应商地址")
    private String address;

    @ApiModelProperty("供应商电话")
    private String tel;

    @ApiModelProperty("邮编")
    private String postcode;

    @ApiModelProperty("联系人")
    private String contacter;

    private String email;

    @ApiModelProperty("账期")
    private String paymentDays;

    @ApiModelProperty("结款方式")
    private String paymentType;

    @ApiModelProperty("删除标识(0:正常， 1:已删除)")
    private Integer delFlag = 0;
}
