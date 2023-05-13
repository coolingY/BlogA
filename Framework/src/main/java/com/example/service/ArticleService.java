package com.example.service;

import com.example.domain.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.ResponseResult;

/**
* @author 施宇
* @description 针对表【sg_article(文章表)】的数据库操作Service
* @createDate 2023-05-05 16:40:03
*/
public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
