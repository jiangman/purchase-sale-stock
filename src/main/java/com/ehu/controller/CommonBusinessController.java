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
            @ApiImplicitParam(name = "searchText", value = "商品名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object queryGoods(@ApiIgnore GoodsInfoRequest request) {
        return businessService.queryGoods(request);
    }

    @GetMapping("/merchants")
    @ApiOperation("查询商家门店")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "searchText", value = "商家名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object queryMerchants(@ApiIgnore MerchantInfoRequest request) {
        return businessService.queryMerchant(request);
    }
}
