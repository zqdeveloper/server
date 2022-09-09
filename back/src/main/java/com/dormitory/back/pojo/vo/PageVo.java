package com.dormitory.back.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("分页结果")
public class PageVo<T> {
    @ApiModelProperty("总数")
    private Long count;

    @ApiModelProperty("总页数")
    private Long pages;

    @ApiModelProperty("数据")
    private List<T> data;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
