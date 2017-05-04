package com.ehu.controller;

import com.ehu.bean.request.GoodsInfoRequest;
import com.ehu.bean.request.MerchantInfoRequest;
import com.ehu.service.CommonBusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-24 18:06.
 */
@RestController
@Api(tags = "一些通用的业务接口")
@RequestMapping("/common")
public class CommonBusinessController {
    @Autowired
    private CommonBusinessService businessService;

    @GetMapping("/goods")
    @ApiOperation("查询商品库中的商品")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "firstMenuId", value = "一级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "secondMenuId", value = "二级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "searchText", value = "商品名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object queryGoods(@ApiIgnore GoodsInfoRequest request) {
        return businessService.queryGoods(request);
    }

    @GetMapping("/first_menus")
    @ApiOperation("查询商品库一级菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getFirstMenus() {
        return businessService.getFirstMenus();
    }

    @GetMapping("/second_menus")
    @ApiOperation("查询商品库二级菜单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "firstMenuId", value = "一级菜单id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getSecondMenus(@ApiIgnore GoodsInfoRequest request) {
        return businessService.getSecondMenus(request.getFirstMenuId());
    }

    @GetMapping("/merchants")
    @ApiOperation("查询商家门店")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "merchantId", value = "商家id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "searchText", value = "商家名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object queryMerchants(@ApiIgnore MerchantInfoRequest request) {
        return businessService.queryMerchant(request);
    }

    @GetMapping("/merchants/detail")
    @ApiOperation("查询店铺信息")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "guid", value = "登陆人id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object queryMerchantDetail(@ApiIgnore MerchantInfoRequest request) {
        return businessService.queryMerchantDetail(request);
    }
}
