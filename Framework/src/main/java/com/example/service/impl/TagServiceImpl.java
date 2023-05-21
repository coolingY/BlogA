package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.Tag;
import com.example.service.TagService;
import com.example.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author 施宇
* @description 针对表【sg_tag(标签)】的数据库操作Service实现
* @createDate 2023-05-18 20:03:49
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




