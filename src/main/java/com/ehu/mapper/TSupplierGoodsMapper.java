package com.ehu.mapper;

import com.ehu.bean.request.SupplierGoodsRequest;
import com.ehu.bean.request.SupplierMenuRequest;
import com.ehu.model.GoodsMenu;
import com.ehu.model.TSupplierGoods;
import com.ehu.util.MyMapper;

import java.util.List;
import java.util.Map;

public interface TSupplierGoodsMapper extends MyMapper<TSupplierGoods> {
    List<Map> getGoods(SupplierGoodsRequest request);

    Map getGoodsDetail(int goodsId);

    int getGoodsCount(SupplierGoodsRequest request);

    List<Map> getSupplierFirstMenus(SupplierMenuRequest request);

    List<Map> getSupplierSecondMenus(SupplierMenuRequest request);

    List<GoodsMenu> getSupplierMenus(SupplierMenuRequest request);
}