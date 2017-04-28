package com.ehu.mapper;

import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.model.TPurchaseOrder;
import com.ehu.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TPurchaseOrderMapper extends MyMapper<TPurchaseOrder> {
    List<Map<String, Object>> queryOrders(PurchaseOrderQueryRequest request);

    int getGoodsSum(int orderId);
}