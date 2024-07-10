package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 投递简历：(SubmitResume)表实体类
 *
 */
@TableName("`submit_resume`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SubmitResume implements Serializable {

    // SubmitResume编号
    @TableId(value = "submit_resume_id", type = IdType.AUTO)
    private Integer submit_resume_id;

    // 企业名称
    @TableField(value = "`enterprise_name`")
    private String enterprise_name;
    // 联系人
    @TableField(value = "`contacts`")
    private String contacts;
    // 招聘岗位
    @TableField(value = "`recruitment_positions`")
    private String recruitment_positions;
    // 工作类型
    @TableField(value = "`job_type`")
    private String job_type;
    // 薪资
    @TableField(value = "`salary`")
    private String salary;
    // 用户
    @TableField(value = "`user`")
    private Integer user;
    // 求职人姓名
    @TableField(value = "`job_applicants_name`")
    private String job_applicants_name;
    // 求职意向
    @TableField(value = "`job_intention`")
    private String job_intention;
    // 学历
    @TableField(value = "`education`")
    private String education;
    // 毕业学校
    @TableField(value = "`graduation_school`")
    private String graduation_school;
    // 专业
    @TableField(value = "`major`")
    private String major;
    // 性别
    @TableField(value = "`gender`")
    private String gender;
    // 年龄
    @TableField(value = "`age`")
    private String age;
    // 个人介绍
    @TableField(value = "`personal_introduction`")
    private String personal_introduction;
    // 个人简历
    @TableField(value = "`curriculum_vitae`")
    private String curriculum_vitae;



    // 审核状态
    @TableField(value = "examine_state")
    private String examine_state;



    // 审核回复
    @TableField(value = "examine_reply")
    private String examine_reply;




    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
