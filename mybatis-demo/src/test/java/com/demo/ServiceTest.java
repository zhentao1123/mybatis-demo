package com.demo;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.sample.model.entity.User;
import com.demo.sample.service.IUserService;

public class ServiceTest extends ApplicationTests {

	@Autowired
	IUserService service;
	
	@Test
	public void test() {
		List<User> userList = service.list();
		System.out.println(userList.size());
	}
	
}
