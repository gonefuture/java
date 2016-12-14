package cn.zhku.mysql;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AccountDao {

	public void updataBalance(Connection con,String name, double balance) {
		/*
		 * 1.得到对象
		 */
		try {
			//Connection con = JdbcUtils.getConnection();
			/*
			 * 2.给出sql模板，创建pstmt
			 */
			String sql = "update account set balance=?+balance where name=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			/*
			 * 3.对参数进行赋值
			 */
			pstmt.setDouble(1, balance); 
			pstmt.setString(2, name);
			
			/*
			 * 4.执行之
			 */
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
