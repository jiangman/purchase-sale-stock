package com.ehu.controller;

import com.ehu.bean.request.MergeOrderRequest;
import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.service.PurchaseOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

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

    @GetMapping
    @ApiOperation("采购列表")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "startTime", value = "开始时间", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "endTime", value = "结束时间", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "merchantId", value = "商家id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "personInCharge", value = "负责人", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "goodsName", value = "商品名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object queryOrders(@ApiIgnore PurchaseOrderQueryRequest request) {
        return purchaseOrderService.findMerchantOrders(request);
    }
}
