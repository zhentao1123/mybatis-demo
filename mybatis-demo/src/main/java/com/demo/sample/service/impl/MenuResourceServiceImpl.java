package com.demo.sample.service.impl;

import com.demo.sample.entity.MenuResource;
import com.demo.sample.mapper.MenuResourceMapper;
import com.demo.sample.service.IMenuResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单资源关系表 服务实现类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Service
public class MenuResourceServiceImpl extends ServiceImpl<MenuResourceMapper, MenuResource> implements IMenuResourceService {

}
