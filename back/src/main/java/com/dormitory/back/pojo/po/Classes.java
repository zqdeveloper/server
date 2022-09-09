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
@TableName(value="classes",keepGlobalPrefix = true)
public class Classes extends BaseMode {


    /*
    *  主键自增Id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  班级名称,高三一班
    */
    @TableField(value = "class_name")
    private String className;


    /*
    *  20220281
    */
    @TableField(value = "class_code")
    private String classCode;


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
    *  所属年级
    */
    @TableField(value = "gradle_id")
    private Integer gradleId;

    public Integer  getId()
    {
      return this.id;
    }

    public void setId(Integer id)
    {
      this.id = id;
    }

    public String  getClassName()
    {
      return this.className;
    }

    public void setClassName(String className)
    {
      this.className = className;
    }

    public String  getClassCode()
    {
      return this.classCode;
    }

    public void setClassCode(String classCode)
    {
      this.classCode = classCode;
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

    public Integer  getGradleId()
    {
      return this.gradleId;
    }

    public void setGradleId(Integer gradleId)
    {
      this.gradleId = gradleId;
    }

 }