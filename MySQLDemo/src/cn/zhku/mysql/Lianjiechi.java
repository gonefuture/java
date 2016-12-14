package cn.zhku.mysql;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

public class Lianjiechi {

	@Test
	public void test() throws SQLException {
		/*
		 * 1。创建连接池对象
		 * 2.配置四大参数
		 * 3。配置池参数
		 * 4。得到连接对象
		 */
	BasicDataSource dataSource	= new BasicDataSource();
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/mydb3");
	dataSource.setUrl("root");
	dataSource.setPassword("123");
	
	dataSource.setMaxActive(20);
	dataSource.setMinIdle(3);
	dataSource.setMaxWait(10000);
	
	Connection con = dataSource.getConnection();
	System.out .println(con.getClass().getName());
	
	
	//con.close();
	}

}
