package com.example.mapper;

import com.example.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 施宇
* @description 针对表【sys_role(角色信息表)】的数据库操作Mapper
* @createDate 2023-05-18 23:30:34
* @Entity com.example.domain.Role
*/
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long id);
}




