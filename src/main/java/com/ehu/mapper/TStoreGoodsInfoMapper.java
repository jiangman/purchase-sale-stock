package com.ehu.mapper;

import com.ehu.model.TStoreGoodsInfo;
import com.ehu.model.TStoreGoodsInfoExample;
import com.ehu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStoreGoodsInfoMapper extends MyMapper<TStoreGoodsInfo> {
    int countByExample(TStoreGoodsInfoExample example);

    int deleteByExample(TStoreGoodsInfoExample example);

    List<TStoreGoodsInfo> selectByExample(TStoreGoodsInfoExample example);

    int updateByExampleSelective(@Param("record") TStoreGoodsInfo record, @Param("example") TStoreGoodsInfoExample example);

    int updateByExample(@Param("record") TStoreGoodsInfo record, @Param("example") TStoreGoodsInfoExample example);
}