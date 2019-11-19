package com.demo;

import org.junit.Test;

import com.demo.sample.generate.MysqlGenerator;

public class MysqlGeneratorTest extends ApplicationTests{

	@Test
	public void doGen() {
		MysqlGenerator gen = new MysqlGenerator();
		gen.generator("user");
	}
	
}
