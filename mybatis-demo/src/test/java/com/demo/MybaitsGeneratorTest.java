package com.demo;

import org.junit.Test;

import com.demo.generate.MysqlGenerator;

public class MybaitsGeneratorTest extends ApplicationTests{

	@Test
	public void testGen() {
		MysqlGenerator gen = new MysqlGenerator();
		gen.generator("user");
	}
}
