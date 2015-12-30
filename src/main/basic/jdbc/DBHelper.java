package main.basic.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 数据帮助类
 * 
 * @author 成都易科远见有限公司
 * 
 */
public class DBHelper {
	// 数据库连接对象
	private static Connection conn;
	
	// 创建连接私有方法
	private static void createConnection() {
		try {
			InputStream fis = DBHelper.class.getResourceAsStream("/jdbc.properties"); // 加载数据库配置文件到内存中
			Properties p = new Properties();
			p.load(fis);

			String jdbc_driverClassName = p.getProperty("jdbc.driverClassName");// 获取数据库配置文件
			String jdbc_url = p.getProperty("jdbc.url");
			String jdbc_username = p.getProperty("jdbc.username");
			String jdbc_password = p.getProperty("jdbc.password");

			Class.forName(jdbc_driverClassName);
			conn = DriverManager.getConnection(jdbc_url, jdbc_username, jdbc_password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 获取连接方法
	public static Connection getConnection() {
		if (conn == null) {
			createConnection();
		}
		return conn;
	}
	
}
