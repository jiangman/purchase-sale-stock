package com.ehu.controller;

import com.ehu.bean.request.MerchantOrderDetailRequest;
import com.ehu.bean.request.MergeOrderRequest;
import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.bean.request.PurchaseOrderRequest;
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

    @GetMapping("/merchant")
    @ApiOperation("商家采购列表")
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

    @GetMapping
    @ApiOperation("合单后的采购列表")
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
    public Object findOrders(@ApiIgnore PurchaseOrderQueryRequest request) {
        return purchaseOrderService.findOrders(request);
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

    @GetMapping("/{orderId}/detail/first_menu")
    @ApiOperation("采购订单详情商品一级菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getDetailFirstMenu(@PathVariable(value = "orderId") int orderId) {
        return purchaseOrderService.getDetailFirstMenu(orderId);
    }

    @GetMapping("/{orderId}/detail/{firstMenuId}")
    @ApiOperation("采购订单详情商品二级菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getDetailSecondMenu(@PathVariable(value = "orderId") int orderId, @PathVariable(value = "firstMenuId") int firstMenuId) {
        return purchaseOrderService.getDetailSecondMenu(orderId, firstMenuId);
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
