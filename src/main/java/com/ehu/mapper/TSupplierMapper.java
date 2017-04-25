package com.ehu.mapper;

import com.ehu.model.TSupplier;
import com.ehu.model.TSupplierExample;
import com.ehu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSupplierMapper extends MyMapper<TSupplier> {
    int countByExample(TSupplierExample example);

    int deleteByExample(TSupplierExample example);

    List<TSupplier> selectByExample(TSupplierExample example);

    int updateByExampleSelective(@Param("record") TSupplier record, @Param("example") TSupplierExample example);

    int updateByExample(@Param("record") TSupplier record, @Param("example") TSupplierExample example);
}