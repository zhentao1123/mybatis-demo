package com.demo;

import java.util.List;

import org.junit.Test;

import com.demo.sample.generate.DBInfo;
import com.demo.sample.generate.MysqlGenerator;
import com.demo.sample.generate.MysqlInfoUtil;

public class MysqlGeneratorTest extends ApplicationTests{

	@Test
	public void doGen() throws Exception{
		List<String> tableNameList = new MysqlInfoUtil(DBInfo.URL, DBInfo.USERNAME, DBInfo.PASSWORD, DBInfo.DB).getTableNames();
		String[] tableNameArr = new String[tableNameList.size()];
		
		MysqlGenerator gen = new MysqlGenerator(DBInfo.URL, DBInfo.USERNAME, DBInfo.PASSWORD);
		gen.generator(tableNameList.toArray(tableNameArr));
	}
	
}
