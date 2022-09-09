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
@TableName(value="dormitory_host",keepGlobalPrefix = true)
public class DormitoryHost extends BaseMode {


    /*
    *  主键自增id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  编号，比如1表示为1号楼；2：表示为2号楼
    */
    @TableField(value = "code")
    private Integer code;


    /*
    *  描述，比如南面宿舍楼
    */
    @TableField(value = "description")
    private String description;


    /*
    *  创建时间
    */
    @TableField(value = "create_time")
    private Date createTime;


    /*
    *  是否使用,1:启用;2:禁用
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