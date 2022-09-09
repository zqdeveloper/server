package com.dormitory.back.base;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.dormitory.back.common.util.JsonVos;
import com.dormitory.back.pojo.vo.DataJsonVo;
import com.dormitory.back.pojo.vo.JsonVo;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public abstract class BaseController<Po extends BaseMode, Service extends IBaseService<Po>> implements InitializingBean {
    private Service service;

    @ApiOperation(value = "1.查询所有", notes = "1.查询所有")
    @GetMapping(value = "/list")
    @ApiOperationSupport(order = 0)
    public @ResponseBody DataJsonVo<List<Po>> list() {
        List<Po> list = service.list();
        return JsonVos.ok(list);
    }

    @ApiOperation(value = "2.根据条件过滤", notes = "2.根据条件过滤")
    @PostMapping(value = "/list")
    @ApiOperationSupport(order = 1)
    public @ResponseBody DataJsonVo<List<Po>> list(@RequestBody Po po) {
        List<Po> list = service.list(po);
        return JsonVos.ok(list);
    }

    @ApiOperation(value = "3.根据id查询一条数据", notes = "3.根据id查询一条数据")
    @ApiOperationSupport(order = 2)
    @GetMapping(value = "/selectById")
    public @ResponseBody DataJsonVo<Po> selectById(@RequestParam("id") Integer id) {
        Po po = service.getById(id);
        return JsonVos.ok(po);
    }

    @ApiOperation(value = "4.根据id删除一条数据", notes = "4.根据id删除一条数据")
    @ApiOperationSupport(order = 3)
    @PostMapping(value = "/deleteById")
    public @ResponseBody JsonVo deleteById(@RequestParam("id") Integer id) {
        UpdateWrapper<Po> wrapper = new UpdateWrapper<>();
        wrapper.set("status_", 0);
        wrapper.eq("id", id);
        boolean update = service.update(wrapper);
        if (!update) {
            return JsonVos.error("删除失败");
        }
        return JsonVos.ok("删除成功");
    }

    @ApiOperation(value = "5.添加", notes = "5.添加")
    @ApiOperationSupport(order = 4)
    @PostMapping(value = "/add")
    public @ResponseBody JsonVo add(@RequestBody Po po) {
        boolean save = service.save(po);
        if (!save) {
            return JsonVos.error("保存失败");
        }
        return JsonVos.ok("保存成功");
    }

    @ApiOperation(value = "6.修改整条数据", notes = "6.修改整条数据")
    @ApiOperationSupport(order = 5)
    @PostMapping(value = "/update")
    public @ResponseBody JsonVo update(@RequestBody Po po) {
        boolean save = service.updateById(po);
        if (!save) {
            return JsonVos.error("修改失败");
        }
        return JsonVos.ok("修改成功");
    }

    @Override
    public void afterPropertiesSet() {
        service = getService();
    }

    public abstract Service getService();

}
