package com.dormitory.back.pojo.vo;

import io.swagger.annotations.ApiModelProperty;

public class KeywordPageReqVo extends PageReqVo {
    @ApiModelProperty("搜索关键词")
    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
