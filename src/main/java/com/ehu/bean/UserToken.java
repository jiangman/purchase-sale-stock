package com.ehu.bean;

import com.ehu.bean.response.SystemMenu;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-24 14:47.
 */
@Data
public class UserToken {
    private Integer id;

    private String userName;

    private String userAccount;

    private String userStatus;

    private String userComment;

    private Integer departmentId;

    private Integer companyId;

    private String token;

    private boolean isMerchant;

    private int merchantId;

    private List<SystemMenu> menus = new ArrayList<>();
}
