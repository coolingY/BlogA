package com.example.service;

import com.example.domain.ResponseResult;
import com.example.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 施宇
* @description 针对表【sys_user(用户表)】的数据库操作Service
* @createDate 2023-05-12 14:02:08
*/
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);
}
