package com.demo.sample.generate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.hutool.core.util.StrUtil;

/**
 * 数据库工具类
 * 
 * @author zhangzhengtao
 *
 */
public class MysqlInfoUtil {

	Log log = LogFactory.getLog(MysqlInfoUtil.class);

	private String driver;
	private String url;
	private String username;
	private String password;
	private String database;

	private Connection conn = null;

	public MysqlInfoUtil() {
	}

	public MysqlInfoUtil(String url, String userName, String password, String database, String driver) {
		this.url = url;
		this.username = userName;
		this.password = password;
		this.database = database;
		this.driver = driver;
	}
	
	public MysqlInfoUtil(String url, String userName, String password, String database) {
		this.url = url;
		this.username = userName;
		this.password = password;
		this.database = database;
		this.driver = "com.mysql.jdbc.Driver";
	}

	private Connection openConn() throws SQLException {
		if (null == conn) {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(url, username, password);
		}
		return conn;
	}

	private void closeConn() throws SQLException {
		if (null != conn && !conn.isClosed()) {
			conn.close();
			conn = null;
		}
	}

	public List<String> getTableNames() throws SQLException {
		List<String> tableNames = new ArrayList<String>();
		Connection conn = openConn();

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("show table status from " + database);

		while (rs.next()) {
			String comment = rs.getString("Comment");
			if(StrUtil.isNotBlank(comment) && comment.contains("VIEW")) { //过滤视图
				continue;
			}else {
				String tableName = rs.getString("Name");
				tableNames.add(tableName);
				// log.info(tableName);
			}
		}

		rs.close();
		stmt.close();
		closeConn();
		return tableNames;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

}
