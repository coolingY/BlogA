package com.example.service;

import com.example.domain.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.ResponseResult;

/**
* @author 施宇
* @description 针对表【sg_comment(评论表)】的数据库操作Service
* @createDate 2023-05-12 21:07:20
*/
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);
}
