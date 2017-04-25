package com.ehu.mapper;

import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.model.TMerchantPurchaseOrder;
import com.ehu.util.MyMapper;

import java.util.List;

public interface TMerchantPurchaseOrderMapper extends MyMapper<TMerchantPurchaseOrder> {
    List<TMerchantPurchaseOrder> queryOrders(PurchaseOrderQueryRequest request);
}