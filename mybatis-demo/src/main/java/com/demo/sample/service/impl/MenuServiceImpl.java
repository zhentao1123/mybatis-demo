package com.demo.sample.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.sample.entity.Menu;
import com.demo.sample.mapper.MenuMapper;
import com.demo.sample.model.dto.MenuTreeDTO;
import com.demo.sample.service.IMenuService;

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

	
	
	@Override
	public List<MenuTreeDTO> getUserPermMenus(Integer uid) {
		List<MenuTreeDTO> menus = baseMapper.getUserPermMenus(uid);
        //return menus.stream().filter(e -> !parentIdNotNull(e.getParentId())).map(e -> TreeUtils.findChildren(e, menus)).collect(Collectors.toList());
        return menus.stream().collect(Collectors.toList());
	}

	/**
     * 父ID不为0并且不为空
     *
     * @param parentId
     * @return
     */
    private boolean parentIdNotNull(Integer parentId) {
        return Objects.nonNull(parentId) && parentId != 0;
    }
}
