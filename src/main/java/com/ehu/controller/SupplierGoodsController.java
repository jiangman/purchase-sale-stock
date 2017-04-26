package com.ehu.controller;

import com.ehu.bean.request.SupplierGoodsRequest;
import com.ehu.bean.request.SupplierGoodsSaveRequest;
import com.ehu.bean.request.SupplierMenuRequest;
import com.ehu.service.SupplierGoodsService;
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
 * @since 2017-04-26 14:53.
 */
@RestController
@Api(tags = "采购商品相关")
@RequestMapping("/supplier_goods")
public class SupplierGoodsController {
    @Autowired
    private SupplierGoodsService supplierGoodsService;

    @PostMapping
    @ApiOperation("发布商品")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object saveSupplierGoods(@RequestBody @Valid SupplierGoodsSaveRequest request) {
        return supplierGoodsService.saveSupplierGoods(request);
    }

    @GetMapping
    @ApiOperation("查询商品列表")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "supplierId", value = "供应商id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "firstMenuId", value = "一级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "secondMenuId", value = "二级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "searchText", value = "商品名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getGoods(@ApiIgnore SupplierGoodsRequest request) {
        return supplierGoodsService.getGoods(request);
    }

    @GetMapping("/{goodsId}")
    @ApiOperation("查询商品详情")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getGoodsDetail(@PathVariable(value = "goodsId") int goodsId) {
        return supplierGoodsService.getGoodsDetail(goodsId);
    }

    @GetMapping("/first_menus")
    @ApiOperation("查询供应商一级商品菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "supplierId", value = "供应商id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getSupplierFirstMenus(@ApiIgnore SupplierMenuRequest request) {
        return supplierGoodsService.getSupplierFirstMenus(request);
    }

    @GetMapping("/second_menus")
    @ApiOperation("查询供应商二级商品菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "supplierId", value = "供应商id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "firstMenuId", value = "一级菜单id", required = true, dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getSupplierSecondMenus(@ApiIgnore SupplierMenuRequest request) {
        return supplierGoodsService.getSupplierSecondMenus(request);
    }
}
