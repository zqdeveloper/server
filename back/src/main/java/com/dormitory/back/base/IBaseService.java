package com.dormitory.back.base;

import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IBaseService<T extends BaseMode> extends IService<T> {
    List<T> list(T t);
}
