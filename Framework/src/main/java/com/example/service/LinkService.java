package com.example.service;

import com.example.domain.Link;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.ResponseResult;

/**
* @author 施宇
* @description 针对表【sg_link(友链)】的数据库操作Service
* @createDate 2023-05-09 22:23:50
*/
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
