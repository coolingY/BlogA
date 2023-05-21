package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName sg_link
 */
@TableName(value ="sg_link")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Link implements Serializable {
    private Long id;

    private String name;

    private String logo;

    private String description;

    private String address;

    private String status;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;
}