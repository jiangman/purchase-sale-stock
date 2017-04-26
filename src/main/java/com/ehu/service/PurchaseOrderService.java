package com.ehu.service;

import com.ehu.bean.request.MergeOrderRequest;
import com.ehu.bean.request.PurchaseOrderQueryRequest;
import com.ehu.mapper.TMerchantPurchaseOrdersDetailMapper;
import com.ehu.mapper.TPurchaseOrderMapper;
import com.ehu.mapper.TPurchaseOrdersDetailMapper;
import com.ehu.model.TMerchantPurchaseOrdersDetail;
import com.ehu.model.TMerchantPurchaseOrdersDetailExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    private TMerchantPurchaseOrdersDetailMapper ordersDetailMapper;

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
    public Object mergeOrders(MergeOrderRequest request) {
        TMerchantPurchaseOrdersDetailExample example = new TMerchantPurchaseOrdersDetailExample();
        example.createCriteria().andDelFlagEqualTo(0).andPurchaseOrderIdIn(request.getOrderIds());
        List<TMerchantPurchaseOrdersDetail> merchantOrderDetails = ordersDetailMapper.selectByExample(example);
        List<TMerchantPurchaseOrdersDetail> mergedList = new ArrayList<>();
        for (TMerchantPurchaseOrdersDetail detail : merchantOrderDetails) {
            int index = mergedList.indexOf(detail);
            if (index != -1) {
                mergedList.set(index, mergedList.get(index).merge(detail));
            } else {
                mergedList.add(detail);
            }
        }
        return mergedList;
    }

}
