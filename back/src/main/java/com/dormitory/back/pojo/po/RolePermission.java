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
@TableName(value="role_permission",keepGlobalPrefix = true)
public class RolePermission extends BaseMode {


    /*
    *  主键自增id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  角色id
    */
    @TableField(value = "role_id")
    private Integer roleId;


    /*
    *  权限id
    */
    @TableField(value = "permission_id")
    private Integer permissionId;


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

    public Integer  getRoleId()
    {
      return this.roleId;
    }

    public void setRoleId(Integer roleId)
    {
      this.roleId = roleId;
    }

    public Integer  getPermissionId()
    {
      return this.permissionId;
    }

    public void setPermissionId(Integer permissionId)
    {
      this.permissionId = permissionId;
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