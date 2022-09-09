package com.dormitory.back.controller;

import com.dormitory.back.base.BaseController;
import com.dormitory.back.pojo.po.DormitoryUser;
import com.dormitory.back.service.DormitoryUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping(value = "/user")
@ApiOperation(value = "用户模块", notes = "用户模块", tags = "用户模块")
public class DormitoryUserController extends BaseController<DormitoryUser, DormitoryUserService> {

    @Resource
    private DormitoryUserService dormitoryUserService;

    @Override
    public DormitoryUserService getService() {
        return dormitoryUserService;
    }


}
