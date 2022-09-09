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
@TableName(value="role",keepGlobalPrefix = true)
public class Role extends BaseMode {


    /*
    *  自增id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  角色名称
    */
    @TableField(value = "role_name")
    private String roleName;


    /*
    *  创建时间
    */
    @TableField(value = "create_time")
    private Date createTime;


    /*
    *  是否启用,1:启用;0:禁用
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

    public String  getRoleName()
    {
      return this.roleName;
    }

    public void setRoleName(String roleName)
    {
      this.roleName = roleName;
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