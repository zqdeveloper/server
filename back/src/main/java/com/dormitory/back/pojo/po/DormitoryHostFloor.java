package com.dormitory.back.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import  java.util.Date;
import java.lang.Integer;
import com.baomidou.mybatisplus.annotation.TableField;
import com.dormitory.back.base.BaseMode;


/*
*  
*/
@TableName(value="dormitory_host_floor",keepGlobalPrefix = true)
public class DormitoryHostFloor extends BaseMode {


    /*
    *  主键自增id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  创建时间
    */
    @TableField(value = "create_time")
    private Date createTime;


    /*
    *  1:启用;0:禁用
    */
    @TableField(value = "status_")
    private Integer status;


    /*
    *  宿舍楼id
    */
    @TableField(value = "dormitory_host_id")
    private Integer dormitoryHostId;


    /*
    *  楼层id
    */
    @TableField(value = "floor_id")
    private Integer floorId;

    public Integer  getId()
    {
      return this.id;
    }

    public void setId(Integer id)
    {
      this.id = id;
    }

    public Date  getCreateTime()
    {
      return this.createTime;
    }

    public void setCreateTime(Date createTime)
    {
      this.createTime = createTime;
    }

    public Integer  getStatus()
    {
      return this.status;
    }

    public void setStatus(Integer status)
    {
      this.status = status;
    }

    public Integer  getDormitoryHostId()
    {
      return this.dormitoryHostId;
    }

    public void setDormitoryHostId(Integer dormitoryHostId)
    {
      this.dormitoryHostId = dormitoryHostId;
    }

    public Integer  getFloorId()
    {
      return this.floorId;
    }

    public void setFloorId(Integer floorId)
    {
      this.floorId = floorId;
    }

 }