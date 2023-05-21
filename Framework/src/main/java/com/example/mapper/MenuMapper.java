package com.example.mapper;

import com.example.domain.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 施宇
* @description 针对表【sys_menu(菜单权限表)】的数据库操作Mapper
* @createDate 2023-05-18 23:26:22
* @Entity com.example.domain.Menu
*/
public interface MenuMapper extends BaseMapper<Menu> {


    List<String> selectPermsByUserId(Long userId);

    List<Menu> selectAllRouterMenu();

    List<Menu> selectRouterMenuTreeByUserId(Long userId);
}




