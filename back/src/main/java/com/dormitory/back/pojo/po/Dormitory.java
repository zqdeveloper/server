package com.dormitory.back.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import  java.util.Date;
import java.lang.String;
import java.lang.Integer;
import com.baomidou.mybatisplus.annotation.TableField;
import com.dormitory.back.base.BaseMode;


/*
*  
*/
@TableName(value="dormitory",keepGlobalPrefix = true)
public class Dormitory extends BaseMode {


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
    *  可容纳人数
    */
    @TableField(value = "count_")
    private Integer count;


    /*
    *  1:启用；0：禁用
    */
    @TableField(value = "status_")
    private Integer status;


    /*
    *  序号
    */
    @TableField(value = "order_")
    private Integer order;


    /*
    *  截止目前可以容纳的总人数
    */
    @TableField(value = "sum_number")
    private Integer sumNumber;


    /*
    *  所属宿舍楼楼层id
    */
    @TableField(value = "dormitory_host_floor_id")
    private Integer dormitoryHostFloorId;


    /*
    *  已入住人数
    */
    @TableField(value = "guests_number")
    private Integer guestsNumber;


    /*
    *  剩余可容纳人数
    */
    @TableField(value = "guests_accommodated")
    private Integer guestsAccommodated;


    /*
    *  1:已住满;2:未住满
    */
    @TableField(value = "full_status")
    private Integer fullStatus;


    /*
    *  宿舍编号：比如：1101
    */
    @TableField(value = "nick")
    private String nick;


    /*
    *  多个年级之间用逗号隔开1,2,3
    */
    @TableField(value = "gradle_id")
    private String gradleId;


    /*
    *  多个班级之间用逗号隔开
    */
    @TableField(value = "class_id")
    private String classId;

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

    public Integer  getCount()
    {
      return this.count;
    }

    public void setCount(Integer count)
    {
      this.count = count;
    }

    public Integer  getStatus()
    {
      return this.status;
    }

    public void setStatus(Integer status)
    {
      this.status = status;
    }

    public Integer  getOrder()
    {
      return this.order;
    }

    public void setOrder(Integer order)
    {
      this.order = order;
    }

    public Integer  getSumNumber()
    {
      return this.sumNumber;
    }

    public void setSumNumber(Integer sumNumber)
    {
      this.sumNumber = sumNumber;
    }

    public Integer  getDormitoryHostFloorId()
    {
      return this.dormitoryHostFloorId;
    }

    public void setDormitoryHostFloorId(Integer dormitoryHostFloorId)
    {
      this.dormitoryHostFloorId = dormitoryHostFloorId;
    }

    public Integer  getGuestsNumber()
    {
      return this.guestsNumber;
    }

    public void setGuestsNumber(Integer guestsNumber)
    {
      this.guestsNumber = guestsNumber;
    }

    public Integer  getGuestsAccommodated()
    {
      return this.guestsAccommodated;
    }

    public void setGuestsAccommodated(Integer guestsAccommodated)
    {
      this.guestsAccommodated = guestsAccommodated;
    }

    public Integer  getFullStatus()
    {
      return this.fullStatus;
    }

    public void setFullStatus(Integer fullStatus)
    {
      this.fullStatus = fullStatus;
    }

    public String  getNick()
    {
      return this.nick;
    }

    public void setNick(String nick)
    {
      this.nick = nick;
    }

    public String  getGradleId()
    {
      return this.gradleId;
    }

    public void setGradleId(String gradleId)
    {
      this.gradleId = gradleId;
    }

    public String  getClassId()
    {
      return this.classId;
    }

    public void setClassId(String classId)
    {
      this.classId = classId;
    }

 }