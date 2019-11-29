package com.demo.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.sample.entity.Menu;
import com.demo.sample.model.dto.MenuTreeDTO;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author BobZ
 * @since 2019-11-20
 */
public interface MenuMapper extends BaseMapper<Menu> {
	/**
     * 获取用户权限菜单
     *
     * @param uid
     * @param statusType
     * @param menuTypes
     * @return
     */
    //List<MenuTreeDTO> getUserPermMenus(@Param("uid") Integer uid, @Param("statusType") StatusEnum statusType, @Param("menuTypes") List<MenuTypeEnum> menuTypes);

    /**
     * 获取用户权限菜单
     *
     * @param uid
     * @param statusType
     * @param menuTypes
     * @return
     */
    List<MenuTreeDTO> getUserPermMenus(@Param("uid") Integer uid);
}
