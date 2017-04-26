package com.ehu.bean.request;

import com.ehu.bean.Page;
import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-26 14:38.
 */
@Data
public class SupplierGoodsRequest extends Page {
    private String searchText = "";

    private int firstMenuId;

    private int secondMenuId;

    private int supplierId;
}
