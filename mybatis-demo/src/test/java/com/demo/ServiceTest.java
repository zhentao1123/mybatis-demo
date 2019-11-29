package com.demo;

import java.util.List;
import java.util.function.Predicate;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.sample.entity.Menu;
import com.demo.sample.model.dto.MenuTreeDTO;
import com.demo.sample.service.IMenuService;

import cn.hutool.json.JSONUtil;
import lombok.extern.java.Log;

@Log
public class ServiceTest extends ApplicationTests {

	@Autowired
	IMenuService menuService;
	
	@Test
	public void test1() {
		List<Menu> list = menuService.list();
		log.info(JSONUtil.toJsonStr(list));
	}
	
	@Test
	public void test2() {
		List<Menu> list = menuService.lambdaQuery().eq(Menu::getParentId, 1).eq(Menu::getId, 25).list();
		log.info(JSONUtil.toJsonStr(list));
	}
	
	@Test
	public void test3() {
		List<Menu> list = menuService.query().eq(Menu.PARENT_ID, 1).list();
		list.stream().filter(new Predicate<Menu>() {
			@Override
			public boolean test(Menu t) {
				return t.getStatus()==0;
			}}).forEach(m -> {log.info(m.getMenuName());});
		//log.info(JSONUtil.toJsonStr(list));
	}
	
	@Test
	public void test4() {
		Page<Menu> page = new Page<Menu>();
		page.setSize(2l);
		List<Menu> list = menuService.query().eq(Menu.PARENT_ID, 1).page(page).setPages(2l).getRecords();
		list.stream().forEach(m->{log.info(m.getMenuName());});
	}
	
	@Test
	public void test5() {
		List<MenuTreeDTO> list = menuService.getUserPermMenus(1);
		log.info(JSONUtil.toJsonStr(list));
	}
	
}
