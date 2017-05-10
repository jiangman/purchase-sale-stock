package com.ehu.bean.request;

import com.ehu.bean.Page;
import lombok.Data;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-25 15:06.
 */
@Data
public class PurchaseOrderQueryRequest extends Page {
    private String startTime;

    private String endTime;

    private int merchantId;

    private String personInCharge;

    private String goodsName;

    private int payStatus;

    private int verifyStatus;

    private int orderStatus = -1;
}
