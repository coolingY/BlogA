package com.service;

import com.domain.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.ResponseResult;

/**
* @author 施宇
* @description 针对表【sg_article(文章表)】的数据库操作Service
* @createDate 2023-05-05 16:40:03
*/
public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
