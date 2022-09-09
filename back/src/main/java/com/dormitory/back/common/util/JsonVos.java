package com.dormitory.back.common.util;


import com.dormitory.back.common.exception.CommonException;
import com.dormitory.back.pojo.result.CodeMsg;
import com.dormitory.back.pojo.vo.DataJsonVo;
import com.dormitory.back.pojo.vo.JsonVo;
import com.dormitory.back.pojo.vo.PageJsonVo;
import com.dormitory.back.pojo.vo.PageVo;

public class JsonVos {
    public static JsonVo error(String msg) {
        return new JsonVo(false, msg);
    }

    public static JsonVo error(CodeMsg msg) {
        return new JsonVo(msg);
    }

    public static JsonVo error(int code, String msg) {
        return new JsonVo(code, msg);
    }

    public static JsonVo error() {
        return new JsonVo(false);
    }

    public static JsonVo ok(CodeMsg msg) {
        return new JsonVo(msg);
    }

    public static JsonVo ok(String msg) {
        return new JsonVo(true, msg);
    }

    public static <T> DataJsonVo<T> ok(T data) {
        return new DataJsonVo<>(data);
    }

    public static <T> PageJsonVo<T> ok(PageVo<T> pageVo) {
        PageJsonVo<T> pageJsonVo = new PageJsonVo<>();
        pageJsonVo.setCount(pageVo.getCount());
        pageJsonVo.setData(pageVo.getData());
        return pageJsonVo;
    }

    public static JsonVo ok() {
        return new JsonVo();
    }

    public static <T> T raise(String msg) throws CommonException {
        throw new CommonException(msg);
    }

    public static <T> T raise(CodeMsg codeMsg) throws CommonException {
        throw new CommonException(codeMsg);
    }
}
