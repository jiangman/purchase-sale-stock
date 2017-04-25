package com.ehu.mapper;

import com.ehu.model.TStoreGoodsMenuFirst;
import com.ehu.model.TStoreGoodsMenuFirstExample;
import com.ehu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TStoreGoodsMenuFirstMapper extends MyMapper<TStoreGoodsMenuFirst> {
    int countByExample(TStoreGoodsMenuFirstExample example);

    int deleteByExample(TStoreGoodsMenuFirstExample example);

    List<TStoreGoodsMenuFirst> selectByExample(TStoreGoodsMenuFirstExample example);

    int updateByExampleSelective(@Param("record") TStoreGoodsMenuFirst record, @Param("example") TStoreGoodsMenuFirstExample example);

    int updateByExample(@Param("record") TStoreGoodsMenuFirst record, @Param("example") TStoreGoodsMenuFirstExample example);
}