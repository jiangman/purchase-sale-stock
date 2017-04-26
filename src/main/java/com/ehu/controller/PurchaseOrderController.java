package com.ehu.controller;

import com.ehu.bean.request.MergeOrderRequest;
import com.ehu.service.PurchaseOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 18:18.
 */
@RestController
@Api(tags = "采购单管理")
@RequestMapping("/orders")
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @PostMapping
    @ApiOperation("合并商家采购订单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object mergeOrders(@RequestBody @Valid MergeOrderRequest request) {
        return purchaseOrderService.mergeOrders(request);
    }
}
