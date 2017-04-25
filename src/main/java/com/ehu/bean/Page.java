package com.ehu.bean;

import lombok.Data;

@Data
public class Page {
    private int pageNo = 1;

    private int pageSize = 10;

    /**
     * 获取mysql offset
     *
     * @return
     */
    public int getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
