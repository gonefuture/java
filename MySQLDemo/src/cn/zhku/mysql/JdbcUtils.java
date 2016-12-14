package cn.zhku.mysql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/*
 * version 1.0
 */

public class JdbcUtils {
	private static Properties props = null;
	static{
		//1.加载配置文件
		try{
			InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("dbconfig.properties");
		props = new Properties();
		props.load(in);
		}	catch(IOException e){
			throw new RuntimeException(e);
		}
		//2.加载驱动
		try{
			Class.forName(props.getProperty("driverClassName"));
		}	catch(ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}
	public static Connection getConnection() throws SQLException {
		/*
		 * 
		 * 1.加载配置文件
		 * 2.加载驱动
		 * 3.调用DriverManager.getConnection()
		 */
		
		//得到Connection
		return DriverManager.getConnection(props.getProperty("url"),
				props.getProperty("username"),
				props.getProperty("password"));
		
	}

}
