package com.ehu.bean.request;

import com.ehu.bean.Page;
import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 10:33.
 */
@Data
public class SupplierQueryRequest extends Page {
    private String supplierName = "";
}
