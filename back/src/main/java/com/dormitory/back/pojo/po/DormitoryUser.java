package com.dormitory.back.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.lang.String;
import java.lang.Integer;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dormitory.back.base.BaseMode;
import org.springframework.format.annotation.DateTimeFormat;


/*
 *
 */
@TableName(value = "dormitory_user", keepGlobalPrefix = true)
public class DormitoryUser extends BaseMode {


    /*
     *  自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
     *  创建日期
     */
    @TableField(value = "create_time")
    private Date createTime;


    /*
     *  是否启用,1启用;2:禁用
     */
    @TableField(value = "statue_")
    private Integer statue;


    /*
     *  用户名称，登录名称
     */
    @TableField(value = "user_name")
    private String userName;


    /*
     *  登录密码
     */
    @TableField(value = "password")
    private String password;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatue() {
        return this.statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DormitoryUser{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", statue=" + statue +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}