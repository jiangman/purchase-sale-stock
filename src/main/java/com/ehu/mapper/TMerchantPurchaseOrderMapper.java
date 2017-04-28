package com.ehu.mapper;

import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.model.TMerchantPurchaseOrder;
import com.ehu.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TMerchantPurchaseOrderMapper extends MyMapper<TMerchantPurchaseOrder> {
    List<Map<String, Object>> queryOrders(PurchaseOrderQueryRequest request);

    int updateOrderStatus(Map<String, Object> params);

    int getGoodsSum(int orderId);
}