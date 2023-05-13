package com.example.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName sg_comment
 */
@TableName(value ="sg_comment")
@Data
public class Comment implements Serializable {
    private Long id;

    private String type;

    private Long articleId;

    private Long rootId;

    private String content;

    private Long toCommentUserId;

    private Long toCommentId;

    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;
}