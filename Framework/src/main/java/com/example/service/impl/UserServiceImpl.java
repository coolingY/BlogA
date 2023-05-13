package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.ResponseResult;
import com.example.domain.User;
import com.example.domain.vo.UserInfoVo;
import com.example.service.UserService;
import com.example.mapper.UserMapper;
import com.example.utils.BeanCopyUtils;
import com.example.utils.SecurityUtils;
import org.springframework.stereotype.Service;

/**
* @author 施宇
* @description 针对表【sys_user(用户表)】的数据库操作Service实现
* @createDate 2023-05-12 14:02:08
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Override
    public ResponseResult userInfo() {
        //获取当前用户id
        Long userId = SecurityUtils.getUserId();
        //根据用户id查询用户信息
        User user = getById(userId);
        //封装成UserInfoVo
        UserInfoVo vo = BeanCopyUtils.copyBean(user,UserInfoVo.class);
        return ResponseResult.okResult(vo);
    }
}




