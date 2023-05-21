package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName sg_category
 */
@TableName(value ="sg_category")
@Data
@AllArgsConstructor
@NoArgsConstructor
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