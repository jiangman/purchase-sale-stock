package com.ehu.service;

import com.ehu.bean.request.SupplierGoodsRequest;
import com.ehu.bean.request.SupplierGoodsSaveDetailRequest;
import com.ehu.bean.request.SupplierGoodsSaveRequest;
import com.ehu.bean.request.SupplierMenuRequest;
import com.ehu.bean.response.GoodsMenuResponse;
import com.ehu.bean.response.PageResponse;
import com.ehu.mapper.TSupplierGoodsMapper;
import com.ehu.model.GoodsMenu;
import com.ehu.model.TSupplierGoods;
import com.ehu.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-26 14:20.
 */
@Service
public class SupplierGoodsService {
    @Autowired
    private TSupplierGoodsMapper supplierGoodsMapper;

    /**
     * 保存采购商品
     *
     * @param request
     * @return
     */
    public Object saveSupplierGoods(SupplierGoodsSaveRequest request) {
        List<TSupplierGoods> supplierGoodss = new ArrayList<>();
        for (SupplierGoodsSaveDetailRequest detailRequest : request.getGoods()) {
            TSupplierGoods supplierGoods = new TSupplierGoods();
            BeanUtils.copyProperties(detailRequest, supplierGoods);
            supplierGoodss.add(supplierGoods);
        }
        int result = 0;
        if (supplierGoodss.size() > 0) {
            result = supplierGoodsMapper.insertList(supplierGoodss);
        }
        return result;
    }

    /**
     * 查询商品列表
     *
     * @param request
     * @return
     */
    public Object getGoods(SupplierGoodsRequest request) {
        return new PageResponse(supplierGoodsMapper.getGoods(request), supplierGoodsMapper.getGoodsCount(request));
    }

    /**
     * 查询商品详情
     *
     * @param goodsId
     * @return
     */
    public Object getGoodsDetail(int goodsId) {
        return supplierGoodsMapper.getGoodsDetail(goodsId);
    }

    /**
     * 获取供应商一级商品菜单
     *
     * @param request
     * @return
     */
    public Object getSupplierFirstMenus(SupplierMenuRequest request) {
        return supplierGoodsMapper.getSupplierFirstMenus(request);
    }

    /**
     * 获取供应商二级商品菜单
     *
     * @param request
     * @return
     */
    public Object getSupplierSecondMenus(SupplierMenuRequest request) {
        return supplierGoodsMapper.getSupplierSecondMenus(request);
    }

    /**
     * 获取供应商商品菜单(所有的菜单)
     *
     * @param request
     * @return
     * @throws IllegalAccessException
     * @throws NoSuchFieldException
     * @throws InstantiationException
     */
    public Object getSupplierMenus(SupplierMenuRequest request) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        List<GoodsMenu> metaList = supplierGoodsMapper.getSupplierMenus(request);
        List<GoodsMenuResponse> responses = BeanUtil.retriveCommonAttrsList(metaList, GoodsMenuResponse.class,
                new String[]{"secondMenuId", "secondMenuName"},
                "firstMenuId",
                "seconds");
        return responses;
    }
}
