package com.demo.sample.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.sample.entity.Menu;
import com.demo.sample.model.dto.MenuTreeDTO;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
public interface IMenuService extends IService<Menu> {
	/**
     * 获取用户权限菜单
     *
     * @param uid
     * @return
     */
    List<MenuTreeDTO> getUserPermMenus(Integer uid);
}
