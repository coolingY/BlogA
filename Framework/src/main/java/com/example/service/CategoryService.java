package com.example.service;

import com.example.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.ResponseResult;

/**
* @author 施宇
* @description 针对表【sg_category(分类表)】的数据库操作Service
* @createDate 2023-05-09 16:52:50
*/
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
