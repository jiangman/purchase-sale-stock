package com.ehu.service;

import com.ehu.bean.request.GoodsInfoRequest;
import com.ehu.bean.request.MerchantInfoRequest;
import com.ehu.bean.response.PageResponse;
import com.ehu.mapper.TStoreGoodsInfoMapper;
import com.ehu.mapper.TStoreGoodsMenuFirstMapper;
import com.ehu.mapper.TStoreGoodsMenuSecondMapper;
import com.ehu.mapper.TStoreMerchantInfoMapper;
import com.ehu.model.TStoreGoodsMenuFirst;
import com.ehu.model.TStoreGoodsMenuFirstExample;
import com.ehu.model.TStoreGoodsMenuSecondExample;
import com.ehu.model.TStoreMerchantInfoExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private TStoreGoodsMenuFirstMapper menuFirstMapper;

    @Autowired
    private TStoreGoodsMenuSecondMapper menuSecondMapper;

    /**
     * 获取商品库一级菜单
     *
     * @return
     */
    public Object getFirstMenus() {
        TStoreGoodsMenuFirstExample menuFirstExample = new TStoreGoodsMenuFirstExample();
        menuFirstExample.createCriteria().andValidFlagEqualTo(1).andSgmfTypeEqualTo(1);
        menuFirstExample.setOrderByClause("sgmf_sort");
        List<TStoreGoodsMenuFirst> menuFirsts = menuFirstMapper.selectByExample(menuFirstExample);
        return menuFirsts;
    }

    /**
     * 获取商品库二级菜单
     *
     * @param pid
     * @return
     */
    public Object getSecondMenus(int pid) {
        TStoreGoodsMenuSecondExample secondExample = new TStoreGoodsMenuSecondExample();
        secondExample.createCriteria().andValidFlagEqualTo(1).andSgmfidEqualTo(pid);
        secondExample.setOrderByClause("sgms_sort");
        return menuSecondMapper.selectByExample(secondExample);
    }

    /**
     * 查询商品库商品
     *
     * @param request
     * @return
     */
    public Object queryGoods(GoodsInfoRequest request) {
        return new PageResponse(goodsInfoMapper.queryGoods(request), goodsInfoMapper.queryGoodsCount(request));
    }

    /**
     * 查询商家
     *
     * @param request
     * @return
     */
    public Object queryMerchant(MerchantInfoRequest request) {
        TStoreMerchantInfoExample example = new TStoreMerchantInfoExample();
        TStoreMerchantInfoExample.Criteria criteria = example.createCriteria();
        criteria.andSmiNameLike("%" + request.getSearchText() + "%");
        if (request.getMerchantId() != 0) {
            criteria.andSmiidEqualTo(request.getMerchantId());
        }
        return merchantInfoMapper.selectByExampleAndRowBounds(example, new RowBounds(0, 10));
    }

    /**
     * 查询店铺信息
     *
     * @param request
     * @return
     */
    public Object queryMerchantDetail(MerchantInfoRequest request) {
        return merchantInfoMapper.queryMerchantDetail(request);
    }
}
