package com.ehu.mapper;

import com.ehu.bean.request.MerchantInfoRequest;
import com.ehu.model.TStoreMerchantInfo;
import com.ehu.util.MyMapper;

import java.util.Map;

public interface TStoreMerchantInfoMapper extends MyMapper<TStoreMerchantInfo> {
    Map<String, Object> queryMerchantDetail(MerchantInfoRequest request);
}