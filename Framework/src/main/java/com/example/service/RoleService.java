package com.example.service;

import com.example.domain.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 施宇
* @description 针对表【sys_role(角色信息表)】的数据库操作Service
* @createDate 2023-05-18 23:30:34
*/
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);
}
