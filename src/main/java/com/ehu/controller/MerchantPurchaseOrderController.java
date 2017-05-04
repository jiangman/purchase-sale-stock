package com.ehu.controller;

import com.ehu.bean.request.MerchantOrderDetailRequest;
import com.ehu.bean.request.MerchantOrderQueryRequest;
import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.bean.request.PurchaseOrderRequest;
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
//        request.setMerchantId(SystemConstants.USER_TOKEN.getMerchantId());
        return purchaseOrderService.getOrders(request);
    }

    @GetMapping("/detail")
    @ApiOperation("采购订单详情")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "orderId", value = "订单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object findDetail(@ApiIgnore MerchantOrderQueryRequest request) {
        return purchaseOrderService.findDetail(request.getOrderId());
    }

    @PutMapping
    @ApiOperation("修改采购订单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object updatePurchaseOrder(@RequestBody @Valid PurchaseOrderRequest request) {
        return purchaseOrderService.updateOrders(request);
    }

    @GetMapping("/detail/first_menu")
    @ApiOperation("采购订单详情商品一级菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "orderId", value = "订单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getDetailFirstMenu(@ApiIgnore MerchantOrderQueryRequest request) {
        return purchaseOrderService.getDetailFirstMenu(request.getOrderId());
    }

    @GetMapping("/detail/second_menu")
    @ApiOperation("采购订单详情商品二级菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "orderId", value = "订单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "firstMenuId", value = "一级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getDetailSecondMenu(@ApiIgnore MerchantOrderQueryRequest request) {
        return purchaseOrderService.getDetailSecondMenu(request.getOrderId(), request.getFirstMenuId());
    }

    @GetMapping("/detail/goods")
    @ApiOperation("查询详情商品")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "firstMenuId", value = "一级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "secondMenuId", value = "二级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "orderId", value = "采购单id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getOrderDetailGoods(@ApiIgnore MerchantOrderDetailRequest request) {
        return purchaseOrderService.getOrderDetailGoods(request);
    }
}
