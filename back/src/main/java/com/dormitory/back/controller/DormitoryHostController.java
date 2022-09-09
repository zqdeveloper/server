package com.dormitory.back.controller;

import com.dormitory.back.base.BaseController;
import com.dormitory.back.pojo.po.DormitoryHost;
import com.dormitory.back.service.DormitoryHostService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@ApiOperation(value = "楼号管理",notes = "楼号管理",tags = "楼号管理")
@RequestMapping(value = "/DormitoryHost")
public class DormitoryHostController extends BaseController<DormitoryHost, DormitoryHostService> {

    @Resource
    private DormitoryHostService dormitoryHostService;

    @Override
    public DormitoryHostService getService() {
        return dormitoryHostService;
    }
}
