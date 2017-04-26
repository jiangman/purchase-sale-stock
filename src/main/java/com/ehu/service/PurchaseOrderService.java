package com.ehu.service;

import com.ehu.bean.request.MergeOrderRequest;
import com.ehu.bean.request.PurchaseOrderDetailRequest;
import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.bean.request.PurchaseOrderRequest;
import com.ehu.mapper.TMerchantPurchaseOrderMapper;
import com.ehu.mapper.TMerchantPurchaseOrdersDetailMapper;
import com.ehu.mapper.TPurchaseOrderMapper;
import com.ehu.mapper.TPurchaseOrdersDetailMapper;
import com.ehu.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 17:25.
 */
@Service
public class PurchaseOrderService {
    @Autowired
    private TPurchaseOrderMapper orderMapper;

    @Autowired
    private TPurchaseOrdersDetailMapper detailMapper;

    @Autowired
    private TMerchantPurchaseOrderMapper merchantPurchaseOrderMapper;

    @Autowired
    private TMerchantPurchaseOrdersDetailMapper merchantPurchaseOrdersDetailMapper;

    @Autowired
    private MerchantPurchaseOrderService merchantPurchaseOrderService;

    /**
     * 查询商家提交的采购单
     *
     * @param request
     * @return
     */
    public Object findMerchantOrders(PurchaseOrderQueryRequest request) {
        return merchantPurchaseOrderService.getOrders(request);
    }

    /**
     * 合并商家的采购订单
     *
     * @param request
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public Object mergeOrders(MergeOrderRequest request) {
        // 1.查询商家提交的采购单详细信息
        TMerchantPurchaseOrdersDetailExample example = new TMerchantPurchaseOrdersDetailExample();
        example.createCriteria().andDelFlagEqualTo(0).andPurchaseOrderIdIn(request.getOrderIds());
        List<TMerchantPurchaseOrdersDetail> merchantOrderDetails = merchantPurchaseOrdersDetailMapper.selectByExample(example);
        // 2.合并商家采购单的详情信息
        List<TMerchantPurchaseOrdersDetail> mergedList = new ArrayList<>();
        BigDecimal totalPrice = new BigDecimal(0);
        for (TMerchantPurchaseOrdersDetail detail : merchantOrderDetails) {
            int index = mergedList.indexOf(detail);
            if (index != -1) {
                mergedList.set(index, mergedList.get(index).merge(detail));
            } else {
                mergedList.add(detail);
            }
            totalPrice = totalPrice.add(detail.getOrderPrice().multiply(new BigDecimal(detail.getOrderQuantity())));
        }
        // 3.生成合并后的采购单及采购详情，并添加到数据库
        TPurchaseOrder purchaseOrder = new TPurchaseOrder();
        purchaseOrder.setOrderTotal(totalPrice);
        purchaseOrder.setOrderStatus(0);
        purchaseOrder.setPayStatus(0);
        purchaseOrder.setVerifyStatus(0);
        purchaseOrder.setDelFlag(0);
        orderMapper.insertSelective(purchaseOrder);
        List<TPurchaseOrdersDetail> details = new ArrayList<>();
        for (TMerchantPurchaseOrdersDetail detail : mergedList) {
            TPurchaseOrdersDetail ordersDetail = new TPurchaseOrdersDetail();
            ordersDetail.setPurchaseOrderId(purchaseOrder.getPurchaseOrderId());
            ordersDetail.setOrderQuantity(detail.getOrderQuantity());
            ordersDetail.setOrderPrice(detail.getOrderPrice());
            ordersDetail.setOrderDetailStatus(0);
            ordersDetail.setGoodsId(detail.getGoodsId());
            ordersDetail.setStandard(detail.getStandard());
            ordersDetail.setDelFlag(0);
            ordersDetail.setGoodsName(detail.getGoodsName());
            details.add(ordersDetail);
        }
        detailMapper.insertList(details);
        // 4.修改商家采购单的状态为：已合单
        Map<String, Object> params = Maps.newHashMap();
        params.put("list", request.getOrderIds());
        params.put("mergedId", purchaseOrder.getPurchaseOrderId());
        merchantPurchaseOrderMapper.updateOrderStatus(params);
        return purchaseOrder;
    }

    /**
     * 查询采购列表
     *
     * @param request
     * @return
     */
    public Object findOrders(PurchaseOrderQueryRequest request) {
        return orderMapper.queryOrders(request);
    }

    /**
     * 查看详情
     *
     * @param orderId
     * @return
     */
    public Object findDetail(int orderId) {
        TPurchaseOrder purchaseOrder = orderMapper.selectByPrimaryKey(orderId);
        TPurchaseOrderExample example = new TPurchaseOrderExample();
        example.createCriteria().andDelFlagEqualTo(0).andPurchaseOrderIdEqualTo(orderId);
        List<TPurchaseOrdersDetail> details = detailMapper.selectByExample(example);
        Map<String, Object> result = new ObjectMapper().convertValue(purchaseOrder, Map.class);
        result.put("details", details);
        return result;
    }

    /**
     * 修改订单
     *
     * @param request
     * @return
     */
    public Object updateOrders(PurchaseOrderRequest request) {
        TPurchaseOrder purchaseOrder = orderMapper.selectByPrimaryKey(request.getPurchaseOrderId());
        BeanUtils.copyProperties(request, purchaseOrder);
        orderMapper.updateByPrimaryKey(purchaseOrder);

        for (PurchaseOrderDetailRequest detailRequest : request.getDetails()) {
            TPurchaseOrdersDetail ordersDetail = detailMapper.selectByPrimaryKey(detailRequest.getPurchaseOrderDetailId());
            BeanUtils.copyProperties(detailRequest, ordersDetail);
            detailMapper.updateByPrimaryKey(ordersDetail);
        }
        return purchaseOrder;
    }
}
