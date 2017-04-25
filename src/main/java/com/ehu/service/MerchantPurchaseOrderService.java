package com.ehu.service;

import com.ehu.mapper.TMerchantPurchaseOrderMapper;
import com.ehu.mapper.TMerchantPurchaseOrdersDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Object savePurchaseOrder() {
        return null;
    }
}
