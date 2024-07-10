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
 * 热门工作：(PopularJobs)表实体类
 *
 */
@TableName("`popular_jobs`")
@Data
@EqualsAndHashCode(callSuper = false)
public class PopularJobs implements Serializable {

    // PopularJobs编号
    @TableId(value = "popular_jobs_id", type = IdType.AUTO)
    private Integer popular_jobs_id;

    // 企业名称
    @TableField(value = "`enterprise_name`")
    private String enterprise_name;
    // 企业地址
    @TableField(value = "`business_address`")
    private String business_address;
    // 企业logo
    @TableField(value = "`enterprise_logo`")
    private String enterprise_logo;
    // 联系人
    @TableField(value = "`contacts`")
    private String contacts;
    // 咨询电话
    @TableField(value = "`consultation_telephone`")
    private String consultation_telephone;
    // 招聘岗位
    @TableField(value = "`recruitment_positions`")
    private String recruitment_positions;
    // 工作类型
    @TableField(value = "`job_type`")
    private String job_type;
    // 招聘人数
    @TableField(value = "`number_of_recruiters`")
    private String number_of_recruiters;
    // 薪资
    @TableField(value = "`salary`")
    private String salary;
    // 工作地址
    @TableField(value = "`work_address`")
    private String work_address;
    // 福利待遇
    @TableField(value = "`fringe_benefits`")
    private String fringe_benefits;
    // 职位信息
    @TableField(value = "`position_information`")
    private String position_information;
    // 招聘要求
    @TableField(value = "`recruitment_requirements`")
    private String recruitment_requirements;

    // 点击数
    @TableField(value = "hits")
    private Integer hits;

    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
