package com.ehu.bean.request;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-26 14:30.
 */
@Data
public class SupplierGoodsSaveRequest {
    List<SupplierGoodsSaveDetailRequest> goods = new ArrayList<>();
}
