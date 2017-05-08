package com.ehu.mapper;

import com.ehu.model.TSupplierMain;
import com.ehu.model.TSupplierMainExample;
import com.ehu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TSupplierMainMapper extends MyMapper<TSupplierMain> {
    int countByExample(TSupplierMainExample example);

    int deleteByExample(TSupplierMainExample example);

    List<TSupplierMain> selectByExample(TSupplierMainExample example);

    int updateByExampleSelective(@Param("record") TSupplierMain record, @Param("example") TSupplierMainExample example);

    int updateByExample(@Param("record") TSupplierMain record, @Param("example") TSupplierMainExample example);
}