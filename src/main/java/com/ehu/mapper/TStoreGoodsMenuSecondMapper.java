package com.ehu.mapper;

import com.ehu.model.TStoreGoodsMenuSecond;
import com.ehu.model.TStoreGoodsMenuSecondExample;
import com.ehu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStoreGoodsMenuSecondMapper extends MyMapper<TStoreGoodsMenuSecond> {
    int countByExample(TStoreGoodsMenuSecondExample example);

    int deleteByExample(TStoreGoodsMenuSecondExample example);

    List<TStoreGoodsMenuSecond> selectByExample(TStoreGoodsMenuSecondExample example);

    int updateByExampleSelective(@Param("record") TStoreGoodsMenuSecond record, @Param("example") TStoreGoodsMenuSecondExample example);

    int updateByExample(@Param("record") TStoreGoodsMenuSecond record, @Param("example") TStoreGoodsMenuSecondExample example);
}