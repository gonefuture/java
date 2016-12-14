package test.mysql.studentScore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScoreDao {
	Connection con = null;
	ResultSet rs;
	Statement stmt;
	
	/*
	 * 遍历表的数据
	 */
	public void findAll()  throws Exception{
		
		try{
		String driverClassNane = "com.mysql.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password ="123";
		
		Class.forName(driverClassNane);
		con = DriverManager.getConnection(url, username, password);
		 stmt = con.createStatement();
		 String sql ="SELECT * FROM stu";
		  rs = stmt.executeQuery(sql);    //得到所有数据的结果
	
		 while(rs.next()){
			 System.out.println(rs.getObject(1)+","
		 +rs.getString("sname")+","+rs.getInt("age")+","+rs.getString("gander")+
		 ", 数学： "+rs.getInt("math")+", 语文 ： "+rs.getInt("chinese")+", 英语 ： "+rs.getInt("english"));
		 }
		 } catch(Exception e){
			throw new RuntimeException(e);
		
		}finally{
			if(rs !=null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
		}	
		
	}
	
	/*
	 * 插入一个数据
	 */
	public void insert(Student student) throws ClassNotFoundException{
		try {
				String driverClassNane = "com.mysql.jdbc.Driver";
				String url ="jdbc:mysql://localhost:3306/student";
				String username = "root";
				String password ="123";
				Class.forName(driverClassNane);
				con = DriverManager.getConnection(url, username, password);
			/*
			 * 2.给出sql模板，创建pstmt
			 */
			String sql = "INSERT INTO stu (sno,sname,age,gander,math,chinese,english) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			/*
			 * 3.对参数进行赋值
			 */
			pstmt.setString(1, student.sno);
			pstmt.setString(2, student.sname );
			pstmt.setInt(3, student.age );
			pstmt.setString(4, student.gander );
			pstmt.setInt(5, student.math );
			pstmt.setInt(6, student.chinese);
			pstmt.setInt(7, student.english );
			
			/*
			 * 4.执行之
			 */
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
			
	}
	
	/*
	 * 根据学号删除来学生数据信息，删除成功则返回一句话。
	 */
	
	public String delete(Student student) throws ClassNotFoundException{
		int result;
		try {
			String driverClassNane = "com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password ="123";
			Class.forName(driverClassNane);
			con = DriverManager.getConnection(url, username, password);
			
			String sql ="DELETE FROM stu WHERE sno=?";    
			PreparedStatement pstmt =con.prepareStatement(sql);
			
			//因为sno学号是唯一的，是主键，所以用它来作为删除某一行的依据。
			pstmt.setString(1, student.sno);
			result = pstmt.executeUpdate();
	
		    } catch (SQLException e) {	
				throw new RuntimeException(e);
			}
		if (result == 1) 
			return "删除学号为："+student.sno+"的数据成功";
		else
			return "删除未成功";
	}
	
	
	/*
	 * 根据学号改变学生的三科成绩
	 */
	public Student  modify(Student student) throws ClassNotFoundException{
		try {
			String driverClassNane = "com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password ="123";
			Class.forName(driverClassNane);
			con = DriverManager.getConnection(url, username, password);
			
			String sql ="UPDATE stu SET math =?, chinese=?, english=? WHERE sno=?";    
			PreparedStatement pstmt =con.prepareStatement(sql);
			
	        pstmt.setInt(1,student.math);  
	        pstmt.setInt(2,student.chinese);
	        pstmt.setInt(3,student.english);  
	        pstmt.setString(4,student.sno);  
	        
	        pstmt.executeUpdate();  
			} catch (SQLException e) {	
				throw new RuntimeException(e);
			}
			return student;
	}
	
			/*
			 * 根据学生姓名查找学生
			 */
	public void  findByName(String name) throws ClassNotFoundException{
		try {
			String driverClassNane = "com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/student";
			String username = "root";
			String password ="123";
			Class.forName(driverClassNane);
			con = DriverManager.getConnection(url, username, password);
			
			String sql =" SELECT * FROM stu WHERE sname=?";
			PreparedStatement pstmt =con.prepareStatement(sql);
			pstmt.setString(1,name);    // 将学生姓名注入sql语句
			rs = pstmt.executeQuery();   //查找得到结果
			while(rs.next()){
				 System.out.println(rs.getObject(1)+","
			 +rs.getString("sname")+","+rs.getInt("age")+","+rs.getString("gander")+
			 ", 数学： "+rs.getInt("math")+", 语文 ： "+rs.getInt("chinese")+", 英语 ： "+rs.getInt("english"));
			 }
			} catch (SQLException e) {	
				throw new RuntimeException(e);
			}
	}
	
	

}
