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
@TableName(value="floor",keepGlobalPrefix = true)
public class Floor extends BaseMode {


    /*
    *  自增id
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
    *  1:第一层;2:第二层
    */
    @TableField(value = "code")
    private Integer code;


    /*
    *  楼层描述，比如第一层楼，第二层等
    */
    @TableField(value = "description")
    private String description;

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

    public Integer  getCode()
    {
      return this.code;
    }

    public void setCode(Integer code)
    {
      this.code = code;
    }

    public String  getDescription()
    {
      return this.description;
    }

    public void setDescription(String description)
    {
      this.description = description;
    }

 }