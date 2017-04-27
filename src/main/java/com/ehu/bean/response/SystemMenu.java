package com.ehu.bean.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-04-27 9:59.
 */
@Data
public class SystemMenu {
    private int menuCode;

    private String menuName;

    private String menuUrl;

    private int parentCode;

    private List<SystemMenu> subMenu = new ArrayList<>();
}
