package com.ehu.service;

import com.ehu.bean.request.GoodsInfoRequest;
import com.ehu.bean.request.MerchantInfoRequest;
import com.ehu.mapper.TStoreGoodsInfoMapper;
import com.ehu.mapper.TStoreMerchantInfoMapper;
import com.ehu.model.TStoreGoodsInfoExample;
import com.ehu.model.TStoreMerchantInfoExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 一些公共的service.
 *
 * @author demon
 * @since 2017-04-24 17:54.
 */
@Service
public class CommonBusinessService {
    @Autowired
    private TStoreGoodsInfoMapper goodsInfoMapper;

    @Autowired
    private TStoreMerchantInfoMapper merchantInfoMapper;

    /**
     * 查询商品库商品
     *
     * @param request
     * @return
     */
    public Object queryGoods(GoodsInfoRequest request) {
        TStoreGoodsInfoExample example = new TStoreGoodsInfoExample();
        example.createCriteria().andSgiNameLike("%" + request.getSearchText() + "%");
        return goodsInfoMapper.selectByExampleAndRowBounds(example, new RowBounds(0, 10));
    }

    /**
     * 查询商家
     *
     * @param request
     * @return
     */
    public Object queryMerchant(MerchantInfoRequest request) {
        TStoreMerchantInfoExample example = new TStoreMerchantInfoExample();
        example.createCriteria().andSmiNameLike("%" + request.getSearchText() + "%");
        return merchantInfoMapper.selectByExampleAndRowBounds(example, new RowBounds(0, 10));
    }
}
