package com.ehu.bean.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 17:39.
 */
@Data
@ApiModel
public class MergeOrderRequest {
    @ApiModelProperty("采购单id列表")
    private List<Integer> orderIds = new ArrayList<>();
}
