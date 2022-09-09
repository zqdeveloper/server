package com.dormitory.back.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.lang.String;
import  java.util.Date;
import java.lang.Integer;
import com.baomidou.mybatisplus.annotation.TableField;
import com.dormitory.back.base.BaseMode;


/*
*  
*/
@TableName(value="gradle",keepGlobalPrefix = true)
public class Gradle extends BaseMode {


    /*
    *  主键自增Id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  年级编号
    */
    @TableField(value = "number")
    private String number;


    /*
    *  年级名称，比如6年级
    */
    @TableField(value = "name")
    private String name;


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

    public Integer  getId()
    {
      return this.id;
    }

    public void setId(Integer id)
    {
      this.id = id;
    }

    public String  getNumber()
    {
      return this.number;
    }

    public void setNumber(String number)
    {
      this.number = number;
    }

    public String  getName()
    {
      return this.name;
    }

    public void setName(String name)
    {
      this.name = name;
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

 }