package com.ehu.mapper;

import com.ehu.bean.request.MerchantOrderDetailRequest;
import com.ehu.model.TMerchantPurchaseOrdersDetail;
import com.ehu.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TMerchantPurchaseOrdersDetailMapper extends MyMapper<TMerchantPurchaseOrdersDetail> {
    List<Map<String, Object>> getDetailFirstMenu(int orderId);

    List<Map<String, Object>> getDetailSecondMenu(Map<String, Object> params);

    List<Map<String, Object>> getOrderDetailGoods(MerchantOrderDetailRequest request);

    List<Map<String, Object>> getOrderDetail(int orderId);
}