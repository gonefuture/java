package cn.zhku.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class sql {

	Connection con = null;
	ResultSet rs;
	Statement stmt;
	@Test
	public void fun()  throws Exception{
		
		try{
		String driverClassNane = "com.mysql.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/exam";
		String username = "root";
		String password ="123";
		
		Class.forName(driverClassNane);
		con = DriverManager.getConnection(url, username, password);
		 stmt = con.createStatement();
		 String sql ="select *from emp";
		  rs = stmt.executeQuery(sql);
	
		 while(rs.next()){
			 System.out.println(rs.getObject(1)+","
		 +rs.getString("ename")+","+rs.getDouble("sal"));
		 }
		
		} catch(Exception e){
			throw new RuntimeException(e);
		
		}finally{
			if(rs !=null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			
			
		}
		
		
		}

}
