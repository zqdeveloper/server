package com.dormitory.back.pojo.vo;


public class DataJsonVo<T> extends JsonVo {
    private T data;

    public DataJsonVo() {

    }

    public DataJsonVo(String msg, T data) {
        super(true, msg);
        this.data = data;
    }

    public DataJsonVo(T data) {
        this(null, data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
