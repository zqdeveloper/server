package com.dormitory.back.service.impl;

import com.dormitory.back.base.IBaseServiceImpl;
import com.dormitory.back.pojo.po.DormitoryUser;
import com.dormitory.back.mapper.DormitoryUserMapper;
import com.dormitory.back.service.DormitoryUserService;
import org.springframework.stereotype.Service;

@Service
public class DormitoryUserServiceImpl extends IBaseServiceImpl<DormitoryUser, DormitoryUserMapper> implements DormitoryUserService {
}
