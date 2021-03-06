package com.ehu.service;

import com.ehu.bean.request.SupplierQueryRequest;
import com.ehu.bean.request.SupplierRequest;
import com.ehu.constants.BusinessConstants;
import com.ehu.constants.ErrorMessageConstants;
import com.ehu.exceptions.BusinessErrorException;
import com.ehu.mapper.TSupplierMainMapper;
import com.ehu.mapper.TSupplierMapper;
import com.ehu.model.TSupplier;
import com.ehu.model.TSupplierExample;
import com.ehu.model.TSupplierMainExample;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 10:32.
 */
@Service
public class SupplierService {
    @Autowired
    private TSupplierMapper supplierMapper;

    @Autowired
    private TSupplierMainMapper supplierMainMapper;

    /**
     * 查询上游供应商列表
     *
     * @param request
     * @return
     */
    public Object querySuppliers(SupplierQueryRequest request) {
        TSupplierExample example = new TSupplierExample();
        example.createCriteria().andSupplierNameLike("%" + request.getSupplierName() + "%").andDelFlagEqualTo(BusinessConstants.DEL_FLAG_UNDEL);
        return supplierMapper.selectByExampleAndRowBounds(example, new RowBounds(request.getOffset(), request.getPageSize()));
    }

    /**
     * 添加供应商
     *
     * @param request
     * @return
     */
    public Object saveSupplier(SupplierRequest request) {
        TSupplier supplier = new TSupplier();
        BeanUtils.copyProperties(request, supplier);
        return supplierMapper.insertSelective(supplier);
    }

    /**
     * 查询详情
     *
     * @param supplierId
     * @return
     */
    public Object findDetail(int supplierId) {
        return supplierMapper.selectByPrimaryKey(supplierId);
    }

    /**
     * 修改供应商
     *
     * @param request
     * @return
     * @throws BusinessErrorException
     */
    public Object updateSupplier(SupplierRequest request) {
        TSupplier supplier = supplierMapper.selectByPrimaryKey(request.getSupplierId());
        if (supplier == null) {
            return ErrorMessageConstants.NO_SUCH_DATA;
        }
        BeanUtils.copyProperties(request, supplier);
        return supplierMapper.updateByPrimaryKey(supplier);
    }

    /**
     * 查询供应商列表
     *
     * @param request
     * @return
     */
    public Object queryMainSuppliers(SupplierQueryRequest request) {
        TSupplierMainExample example = new TSupplierMainExample();
        example.createCriteria().andSupplierNameLike("%" + request.getSupplierName() + "%").andDelFlagEqualTo(BusinessConstants.DEL_FLAG_UNDEL);
        return supplierMainMapper.selectByExampleAndRowBounds(example, new RowBounds(request.getOffset(), request.getPageSize()));
    }

    /**
     * 设置默认供应商
     *
     * @param request
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public Object setDefaultSupplier(SupplierRequest request) {
        supplierMapper.setNonDefault();
        return supplierMapper.setDefault(request.getSupplierId());
    }
}
