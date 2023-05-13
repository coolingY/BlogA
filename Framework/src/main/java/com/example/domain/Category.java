package com.example.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName sg_category
 */
@TableName(value ="sg_category")
@Data
public class Category implements Serializable {
    private Long id;

    private String name;

    private Long pid;

    private String description;

    private String status;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;
}