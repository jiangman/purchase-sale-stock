package com.ehu.bean;

public class Page {
    private int pageNo = 1;

    private int pageSize = 10;

    private int offset;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return (pageNo - 1) * pageSize;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
