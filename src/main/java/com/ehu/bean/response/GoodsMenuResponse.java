package com.ehu.bean.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-05-03 13:33.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GoodsMenuResponse {
    private int firstMenuId;

    private String firstMenuName;

    private List<Map<String, Object>> seconds = new ArrayList<>();

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GoodsMenuResponse) {
            GoodsMenuResponse goodsMenuResponse = (GoodsMenuResponse) obj;
            if (goodsMenuResponse.getFirstMenuId() == this.getFirstMenuId()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
