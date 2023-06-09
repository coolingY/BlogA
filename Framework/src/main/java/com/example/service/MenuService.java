package com.example.service;

import com.example.domain.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 施宇
* @description 针对表【sys_menu(菜单权限表)】的数据库操作Service
* @createDate 2023-05-18 23:26:22
*/
public interface MenuService extends IService<Menu> {

    List<String> selectPermsByUserId(Long id);

    List<Menu> selectRouterMenuTreeByUserId(Long userId);
}
