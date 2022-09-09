package com.dormitory.back.service.impl;

import com.dormitory.back.base.IBaseServiceImpl;
import com.dormitory.back.common.enhance.MpPage;
import com.dormitory.back.pojo.po.Dormitory;
import com.dormitory.back.mapper.DormitoryMapper;
import com.dormitory.back.pojo.vo.PageVo;
import com.dormitory.back.pojo.vo.req.page.DormitoryPageReqVo;
import com.dormitory.back.service.DormitoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DormitoryServiceImpl extends IBaseServiceImpl<Dormitory, DormitoryMapper> implements DormitoryService {
    @Override
    public List<Map<String, Object>> getAll() {
        return baseMapper.getAll();
    }

    @Override
    public PageVo<Map<String, Object>> selectPage(DormitoryPageReqVo dormitoryPageReqVo) {
        return baseMapper.selectMapsPage(new MpPage<>(dormitoryPageReqVo), null).buildVo();
    }
}
