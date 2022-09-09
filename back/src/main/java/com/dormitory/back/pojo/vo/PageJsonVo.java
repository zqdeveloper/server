package com.dormitory.back.pojo.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;


public class PageJsonVo<T> extends DataJsonVo<List<T>> {
    @ApiModelProperty("总数")
    private Long count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
