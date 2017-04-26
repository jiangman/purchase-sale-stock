package com.ehu.mapper;

import com.ehu.bean.request.GoodsInfoRequest;
import com.ehu.model.TStoreGoodsInfo;
import com.ehu.util.MyMapper;

import java.util.List;

public interface TStoreGoodsInfoMapper extends MyMapper<TStoreGoodsInfo> {
    List<TStoreGoodsInfo> queryGoods(GoodsInfoRequest request);

    int queryGoodsCount(GoodsInfoRequest request);
}