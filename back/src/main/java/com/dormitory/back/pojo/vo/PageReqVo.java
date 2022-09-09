package com.dormitory.back.pojo.vo;

import io.swagger.annotations.ApiModelProperty;

public class PageReqVo {
    private static final int DEFAULT_SIZE = 10;
    @ApiModelProperty("页码")
    private long page;

    @ApiModelProperty("每页的大小")
    private long size;

    public long getPage() {
        return Math.max(page, 1);
    }

    public long getSize() {
        return size < 1 ? DEFAULT_SIZE : size;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
