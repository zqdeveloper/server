package com.dormitory.back.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.lang.Integer;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dormitory.back.base.BaseMode;


/*
 *
 */
@TableName(value = "user_role", keepGlobalPrefix = true)
public class UserRole extends BaseMode {


    /*
     *  自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
     *  用户id,关联用户user表
     */
    @TableField(value = "dormitory_user_id")
    private Integer dormitoryUserId;


    /*
     *  角色id
     */
    @TableField(value = "role_id")
    private Integer roleId;


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

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDormitoryUserId() {
        return this.dormitoryUserId;
    }

    public void setDormitoryUserId(Integer dormitoryUserId) {
        this.dormitoryUserId = dormitoryUserId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}