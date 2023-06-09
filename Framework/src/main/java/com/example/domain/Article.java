package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName sg_article
 */
@TableName(value ="sg_article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Article implements Serializable {
    private Long id;

    private String title;

    private String content;

    private String summary;

    private Long categoryId;

    @TableField(exist = false)
    private String categoryName;

    private String thumbnail;

    private String isTop;

    private String status;

    private Long viewCount;

    private String isComment;

    private Long createBy;

    private Date createTime;

    private Long updateBy;

    private Date updateTime;

    private Integer delFlag;

    private static final long serialVersionUID = 1L;

    public Article(Long id, long viewCount) {
        this.id=id;
        this.viewCount=viewCount;
    }
}