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
 * 工作类型：(JobType)表实体类
 *
 */
@TableName("`job_type`")
@Data
@EqualsAndHashCode(callSuper = false)
public class JobType implements Serializable {

    // JobType编号
    @TableId(value = "job_type_id", type = IdType.AUTO)
    private Integer job_type_id;

    // 工作类型
    @TableField(value = "`job_type`")
    private String job_type;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
