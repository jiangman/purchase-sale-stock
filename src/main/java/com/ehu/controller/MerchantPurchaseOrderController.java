package com.ehu.controller;

import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.bean.request.PurchaseOrderRequest;
import com.ehu.constants.SystemConstants;
import com.ehu.service.MerchantPurchaseOrderService;
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
 * @since 2017-04-25 14:38.
 */
@RestController
@Api(tags = "商家端采购")
@RequestMapping("/merchant/orders")
public class MerchantPurchaseOrderController {
    @Autowired
    private MerchantPurchaseOrderService purchaseOrderService;

    @PostMapping
    @ApiOperation("新建采购订单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object savePurchaseOrder(@RequestBody @Valid PurchaseOrderRequest request) throws Exception {
        return purchaseOrderService.savePurchaseOrder(request);
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
        request.setMerchantId(SystemConstants.USER_TOKEN.getMerchantId());
        return purchaseOrderService.getOrders(request);
    }

    @GetMapping("/{orderId}")
    @ApiOperation("采购订单详情")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object findDetail(@PathVariable(value = "orderId") int orderId) {
        return purchaseOrderService.findDetail(orderId);
    }

    @PutMapping
    @ApiOperation("修改采购订单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object updatePurchaseOrder(@RequestBody @Valid PurchaseOrderRequest request) {
        return purchaseOrderService.updateOrders(request);
    }
}
