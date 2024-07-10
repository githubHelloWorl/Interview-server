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
 * 经验分享：(ExperienceSharing)表实体类
 *
 */
@TableName("`experience_sharing`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ExperienceSharing implements Serializable {

    // ExperienceSharing编号
    @TableId(value = "experience_sharing_id", type = IdType.AUTO)
    private Integer experience_sharing_id;

    // 用户
    @TableField(value = "`user`")
    private Integer user;
    // 用户姓名
    @TableField(value = "`user_name`")
    private String user_name;
    // 分享主题
    @TableField(value = "`share_theme`")
    private String share_theme;
    // 分享时间
    @TableField(value = "`share_time`")
    private Timestamp share_time;
    // 工作单位
    @TableField(value = "`work_unit`")
    private String work_unit;
    // 工作职位
    @TableField(value = "`job_position`")
    private String job_position;
    // 工作经验
    @TableField(value = "`hands_on_background`")
    private String hands_on_background;

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
