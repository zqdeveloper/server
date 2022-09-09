package com.dormitory.back.base;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dormitory.back.base.BaseMode;
import com.dormitory.back.base.IBaseMapper;
import com.dormitory.back.base.IBaseService;
import com.dormitory.back.common.util.ClassUtils;

import java.util.List;
import java.util.Map;

public class IBaseServiceImpl<T extends BaseMode, M extends IBaseMapper<T>> extends ServiceImpl<M, T> implements IBaseService<T> {


    @Override
    public List<T> list(T t) {
        Map<String, Object> columns = ClassUtils.getColumns(t);
        return baseMapper.selectByMap(columns);
    }
}
