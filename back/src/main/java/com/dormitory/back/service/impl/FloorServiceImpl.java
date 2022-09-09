package com.dormitory.back.service.impl;

import com.dormitory.back.base.IBaseServiceImpl;
import com.dormitory.back.pojo.po.Floor;
import com.dormitory.back.mapper.FloorMapper;
import com.dormitory.back.service.FloorService;
import org.springframework.stereotype.Service;

@Service
public class FloorServiceImpl extends IBaseServiceImpl<Floor, FloorMapper> implements FloorService {
}
