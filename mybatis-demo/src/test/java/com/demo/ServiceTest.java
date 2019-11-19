package com.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.sample.model.entity.User;
import com.demo.sample.service.IUserService;

import lombok.extern.java.Log;

@Log
public class ServiceTest extends ApplicationTests {

	@Autowired
	IUserService service;
	
	@Test
	public void list() {
		List<User> userList = service.list();
	}
	
	@Test
	public void insert() {
		List<User> userList = service.list();
		log.info(userList.size()+"");
		
		User user = new User();
		user.setAge(11);
		user.setName("Mike");
		user.setCreateTime(LocalDateTime.now());
		service.save(user);
		
		userList = service.list();
		log.info(userList.size()+"");
	}
}
