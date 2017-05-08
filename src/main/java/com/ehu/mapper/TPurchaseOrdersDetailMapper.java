package com.ehu.mapper;

import com.ehu.bean.business.MerchantOrderBean;
import com.ehu.bean.business.SupplierGoodsBean;
import com.ehu.bean.request.MerchantOrderDetailRequest;
import com.ehu.model.TPurchaseOrdersDetail;
import com.ehu.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TPurchaseOrdersDetailMapper extends MyMapper<TPurchaseOrdersDetail> {
    List<Map<String, Object>> getDetailFirstMenu(int orderId);

    List<Map<String, Object>> getDetailSecondMenu(Map<String, Object> params);

    List<Map<String, Object>> getOrderDetailGoods(MerchantOrderDetailRequest request);

    List<SupplierGoodsBean> getExcelOrders(int orderId);

    List<MerchantOrderBean> getExcelMerchantOrders(MerchantOrderDetailRequest request);
}