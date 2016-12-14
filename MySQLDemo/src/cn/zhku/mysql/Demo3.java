package cn.zhku.mysql;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
public class Demo3 {
	@Test
	public void fun3() throws ClassNotFoundException, IOException, SQLException{
		Connection con = JdbcUtils.getConnection();
		System.out.println(con);
	}

	
		public void zhuanZhang(String from,String to, double money) {
			Connection con = null;
			try{
				con = JdbcUtils.getConnection(); 
				con.setAutoCommit(false);
				AccountDao  dao = new AccountDao();
				dao.updataBalance(con,from,-money);
				if(true){
					throw new RuntimeException("不好意思");
				}
				dao.updataBalance(con,to, money);
				
				//提交事物
				con.commit(); 
				con.close();
				
			} catch(Exception e){
				try{
					con.rollback();
				}	catch(SQLException e1){
					throw new RuntimeException(e);
				}
				
			}
			
		}
		


		@Test
		public void fun1(){
			zhuanZhang("zs","ls",100);
			
		}

}

