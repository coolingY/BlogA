package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName sg_tag
 */
@SuppressWarnings("serial")
@TableName(value ="sg_tag")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tag implements Serializable {
    @TableId   //!
    private Long id;

    private String name;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Integer delFlag;

    private String remark;

    private static final long serialVersionUID = 1L;
}