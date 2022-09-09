package com.dormitory.back.mapper;

import com.dormitory.back.base.IBaseMapper;
import com.dormitory.back.pojo.po.Dormitory;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DormitoryMapper extends IBaseMapper<Dormitory> {
    public List<Map<String,Object>> getAll();
}
