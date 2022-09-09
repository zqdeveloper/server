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
@TableName(value="student",keepGlobalPrefix = true)
public class Student extends BaseMode {


    /*
    *  主键自增Id
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /*
    *  学生姓名
    */
    @TableField(value = "sutdent_name")
    private String studentName;


    /*
    *  1:男;0:女
    */
    @TableField(value = "student_sex")
    private Integer studentSex;


    /*
    *  学生学号
    */
    @TableField(value = "student_id_card")
    private String studentIdCard;


    /*
    *  学生电话
    */
    @TableField(value = "student_phone")
    private String studentPhone;


    /*
    *  创建时间
    */
    @TableField(value = "create_time")
    private Date createTime;


    /*
    *  1:已经安排宿舍，0:未安排宿舍; 2:不需要安排宿舍
    */
    @TableField(value = "lodging")
    private Integer lodging;


    /*
    *  所在班级
    */
    @TableField(value = "class_id")
    private Integer classId;


    /*
    *  备注
    */
    @TableField(value = "remark_")
    private String remark;


    /*
    *  所在年级
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer  getStudentSex()
    {
      return this.studentSex;
    }

    public void setStudentSex(Integer studentSex)
    {
      this.studentSex = studentSex;
    }

    public String  getStudentIdCard()
    {
      return this.studentIdCard;
    }

    public void setStudentIdCard(String studentIdCard)
    {
      this.studentIdCard = studentIdCard;
    }

    public String  getStudentPhone()
    {
      return this.studentPhone;
    }

    public void setStudentPhone(String studentPhone)
    {
      this.studentPhone = studentPhone;
    }

    public Date  getCreateTime()
    {
      return this.createTime;
    }

    public void setCreateTime(Date createTime)
    {
      this.createTime = createTime;
    }

    public Integer  getLodging()
    {
      return this.lodging;
    }

    public void setLodging(Integer lodging)
    {
      this.lodging = lodging;
    }

    public Integer  getClassId()
    {
      return this.classId;
    }

    public void setClassId(Integer classId)
    {
      this.classId = classId;
    }

    public String  getRemark()
    {
      return this.remark;
    }

    public void setRemark(String remark)
    {
      this.remark = remark;
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