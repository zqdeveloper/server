package com.dormitory.back.service;

import com.dormitory.back.base.IBaseService;
import com.dormitory.back.pojo.po.Dormitory;
import com.dormitory.back.pojo.vo.PageVo;
import com.dormitory.back.pojo.vo.req.page.DormitoryPageReqVo;

import java.util.List;
import java.util.Map;

public interface DormitoryService extends IBaseService<Dormitory> {
    public List<Map<String, Object>> getAll();

    PageVo<Map<String, Object>> selectPage(DormitoryPageReqVo dormitoryPageReqVo);
}
