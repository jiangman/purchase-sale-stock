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

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    @GetMapping("/downloadExcel")
    @ApiOperation("下载合并的采购订单")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "orderIds", value = "待合并的订单id", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "header")
    })
    public void downloadExcel(@ApiIgnore MergeOrderRequest request, HttpServletResponse response) throws IOException {
        ByteArrayOutputStream os = (ByteArrayOutputStream) purchaseOrderService.getExcelOrders(request);
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String nowString = format.format(new Date());
        String fileName = "采购单-" + nowString;
        response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "iso-8859-1"));

        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }
}
