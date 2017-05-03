package com.ehu.controller;

import com.ehu.bean.request.SupplierQueryRequest;
import com.ehu.bean.request.SupplierRequest;
import com.ehu.service.SupplierService;
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
 * @since 2017-04-25 10:59.
 */
@RestController
@Api(tags = "供应商管理")
@RequestMapping("/suppliers")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping
    @ApiOperation("查询供应商列表")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "supplierName", value = "供应商名称", dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "pageNo", value = "页码", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object getSuppliers(@ApiIgnore SupplierQueryRequest request) {
        return supplierService.querySuppliers(request);
    }

    @PostMapping
    @ApiOperation("新增供应商")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object saveSupplier(@RequestBody @Valid SupplierRequest request) {
        return supplierService.saveSupplier(request);
    }

    @PutMapping
    @ApiOperation("修改供应商")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object updateSupplier(@RequestBody @Valid SupplierRequest request) {
        return supplierService.updateSupplier(request);
    }

    @GetMapping("/detail")
    @ApiOperation("供应商详情")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "supplierId", value = "供应商Id", dataType = "int", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public Object findDetail(@ApiIgnore SupplierRequest request) {
        return supplierService.findDetail(request.getSupplierId());
    }
}
