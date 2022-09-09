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
@TableName(value="permission",keepGlobalPrefix = true)
public class Permission extends BaseMode {


    /*
    *  权限自增Id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  权限名称
    */
    @TableField(value = "permission_name")
    private String permissionName;


    /*
    *  权限码
    */
    @TableField(value = "permission_code")
    private String permissionCode;


    /*
    *  是否启用;1:启用;0:禁用
    */
    @TableField(value = "status_")
    private Integer status;


    /*
    *  创建时间
    */
    @TableField(value = "create_time")
    private Date createTime;


    /*
    *  是否是菜单:1:表示为菜单;2:表示为接口和权限
    */
    @TableField(value = "is_menu")
    private Integer isMenu;


    /*
    *  链接
    */
    @TableField(value = "url")
    private String url;


    /*
    *  导航菜单前面的小图标
    */
    @TableField(value = "icon")
    private String icon;

    public Integer  getId()
    {
      return this.id;
    }

    public void setId(Integer id)
    {
      this.id = id;
    }

    public String  getPermissionName()
    {
      return this.permissionName;
    }

    public void setPermissionName(String permissionName)
    {
      this.permissionName = permissionName;
    }

    public String  getPermissionCode()
    {
      return this.permissionCode;
    }

    public void setPermissionCode(String permissionCode)
    {
      this.permissionCode = permissionCode;
    }

    public Integer  getStatus()
    {
      return this.status;
    }

    public void setStatus(Integer status)
    {
      this.status = status;
    }

    public Date  getCreateTime()
    {
      return this.createTime;
    }

    public void setCreateTime(Date createTime)
    {
      this.createTime = createTime;
    }

    public Integer  getIsMenu()
    {
      return this.isMenu;
    }

    public void setIsMenu(Integer isMenu)
    {
      this.isMenu = isMenu;
    }

    public String  getUrl()
    {
      return this.url;
    }

    public void setUrl(String url)
    {
      this.url = url;
    }

    public String  getIcon()
    {
      return this.icon;
    }

    public void setIcon(String icon)
    {
      this.icon = icon;
    }

 }