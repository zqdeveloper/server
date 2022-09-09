package com.dormitory.back.controller;

import com.dormitory.back.base.BaseController;
import com.dormitory.back.common.util.JsonVos;
import com.dormitory.back.pojo.po.Dormitory;
import com.dormitory.back.pojo.vo.PageJsonVo;
import com.dormitory.back.pojo.vo.PageVo;
import com.dormitory.back.pojo.vo.req.page.DormitoryPageReqVo;
import com.dormitory.back.service.DormitoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/dormitory")
@ApiOperation(value = "宿舍模块",notes = "宿舍模块",tags = "宿舍模块")
@RestController
public class DormitoryController extends BaseController<Dormitory, DormitoryService> {
    @Resource
    private DormitoryService dormitoryService;

    @Override
    public DormitoryService getService() {
        return dormitoryService;
    }

    @GetMapping(value = "/shows")
    public @ResponseBody
    List<Map<String, Object>> getAll() {
        return dormitoryService.getAll();
    }

    @ApiOperation("查询宿舍楼详情")
    @PostMapping(value = "/pages")
    public @ResponseBody PageJsonVo<Map<String, Object>> page(@RequestBody DormitoryPageReqVo dormitoryPageReqVo) {
        PageVo<Map<String, Object>> mapPageVo = dormitoryService.selectPage(dormitoryPageReqVo);
        return JsonVos.ok(mapPageVo);
    }
}
