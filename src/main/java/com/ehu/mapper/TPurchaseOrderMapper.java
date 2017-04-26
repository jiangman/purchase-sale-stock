package com.ehu.mapper;

import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.model.TPurchaseOrder;
import com.ehu.util.MyMapper;

import java.util.List;

public interface TPurchaseOrderMapper extends MyMapper<TPurchaseOrder> {
    List<TPurchaseOrder> queryOrders(PurchaseOrderQueryRequest request);
}