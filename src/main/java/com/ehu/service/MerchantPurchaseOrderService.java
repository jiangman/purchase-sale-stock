package com.ehu.service;

import com.ehu.bean.request.PurchaseOrderDetailRequest;
import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.bean.request.PurchaseOrderRequest;
import com.ehu.constants.SystemConstants;
import com.ehu.mapper.TMerchantPurchaseOrderMapper;
import com.ehu.mapper.TMerchantPurchaseOrdersDetailMapper;
import com.ehu.model.TMerchantPurchaseOrder;
import com.ehu.model.TMerchantPurchaseOrdersDetail;
import com.ehu.model.TMerchantPurchaseOrdersDetailExample;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 商家端采购订单.
 *
 * @author demon
 * @since 2017-04-24 17:42.
 */
@Service
public class MerchantPurchaseOrderService {
    @Autowired
    private TMerchantPurchaseOrderMapper orderMapper;

    @Autowired
    private TMerchantPurchaseOrdersDetailMapper ordersDetailMapper;

    @Transactional(rollbackFor = Exception.class)
    public Object savePurchaseOrder(PurchaseOrderRequest request) throws Exception {
        TMerchantPurchaseOrder merchantPurchaseOrder = new TMerchantPurchaseOrder();
        BeanUtils.copyProperties(request, merchantPurchaseOrder);
        merchantPurchaseOrder.setOrderStatus(0);
        String currentUser = SystemConstants.USER_TOKEN.getUserName();
        merchantPurchaseOrder.setCreateBy(currentUser);
        merchantPurchaseOrder.setUpdateBy(currentUser);
        Date now = new Date();
        merchantPurchaseOrder.setCreateTime(now);
        merchantPurchaseOrder.setUpdateTime(now);
        merchantPurchaseOrder.setMerchantId(SystemConstants.USER_TOKEN.getMerchantId());
        int resultCount = orderMapper.insertSelective(merchantPurchaseOrder);
        if (resultCount == 1) {
            int orderId = merchantPurchaseOrder.getPurchaseOrderId();
            for (PurchaseOrderDetailRequest detailRequest : request.getDetails()) {
                TMerchantPurchaseOrdersDetail detail = new TMerchantPurchaseOrdersDetail();
                BeanUtils.copyProperties(detailRequest, detail);
                detail.setPurchaseOrderId(orderId);
                detail.setOrderDetailStatus(0);
                ordersDetailMapper.insert(detail);
            }
        } else {
            throw new Exception("添加失败");
        }
        return resultCount;
    }

    /**
     * 查询列表
     *
     * @param request
     * @return
     */
    public Object getOrders(PurchaseOrderQueryRequest request) {
        return orderMapper.queryOrders(request);
    }

    /**
     * 查询详情
     *
     * @param orderId
     * @return
     */
    public Object findDetail(int orderId) {
        TMerchantPurchaseOrder merchantPurchaseOrder = orderMapper.selectByPrimaryKey(orderId);
        TMerchantPurchaseOrdersDetailExample example = new TMerchantPurchaseOrdersDetailExample();
        example.createCriteria().andDelFlagEqualTo(0).andPurchaseOrderIdEqualTo(orderId);
        List<TMerchantPurchaseOrdersDetail> details = ordersDetailMapper.selectByExample(example);
        Map<String, Object> result = new ObjectMapper().convertValue(merchantPurchaseOrder, Map.class);
        result.put("details", details);
        return result;
    }

    @Transactional(rollbackFor = Exception.class)
    public Object updateOrders(PurchaseOrderRequest request) {
        TMerchantPurchaseOrder merchantPurchaseOrder = orderMapper.selectByPrimaryKey(request.getPurchaseOrderId());
        BeanUtils.copyProperties(request, merchantPurchaseOrder);
        orderMapper.updateByPrimaryKey(merchantPurchaseOrder);

        for (PurchaseOrderDetailRequest detailRequest : request.getDetails()) {
            TMerchantPurchaseOrdersDetail ordersDetail = ordersDetailMapper.selectByPrimaryKey(detailRequest.getPurchaseOrderDetailId());
            BeanUtils.copyProperties(detailRequest, ordersDetail);
            ordersDetailMapper.updateByPrimaryKey(ordersDetail);
        }
        return merchantPurchaseOrder;
    }
}
