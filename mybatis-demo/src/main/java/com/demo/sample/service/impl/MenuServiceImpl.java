package com.demo.sample.service.impl;

import com.demo.sample.entity.Menu;
import com.demo.sample.mapper.MenuMapper;
import com.demo.sample.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
