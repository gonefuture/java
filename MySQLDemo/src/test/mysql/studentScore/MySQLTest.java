package test.mysql.studentScore;

import org.junit.Test;
public class MySQLTest {
	
	/*
	 * 基于JUnit的测试类
	 */
	
	@Test
	/*
	 * 测试查找所有数据的方法
	 */

	public void findAllTest() throws Exception{
		ScoreDao scoreDao = new ScoreDao();
		scoreDao.findAll();
	}
	
	
	@Test
	/*
	 * 将数据分装进实体类，插入数据库
	 */
	public void insertTest() throws ClassNotFoundException{
		ScoreDao scoreDao = new ScoreDao();
		Student student  = new Student("4","蛤蛤",20,"男",99,90,90);
		scoreDao.insert(student);
		
	}
	
	@Test
	/*
	 * 根据学号修改数据
	 */
	public void modifyTest() throws ClassNotFoundException{
		Student student =  new Student();
		ScoreDao scoreDao = new ScoreDao();
		
		//将要修改的数据封装进实体类，用sno来决定修改是哪一个学生
		student.setSno("2");  //修改学号为2的学生成绩
		student.setMath(85);
		student.setChinese(85);
		student.setEnglish(99);
		
		System.out.println(scoreDao.modify(student).toString());
		
	}

	@Test
	/*
	 * 按学号删除
	 */
	public void deleteTest() throws ClassNotFoundException{
		Student student =  new Student();
		ScoreDao scoreDao = new ScoreDao();
		student.setSno("4");  //注意，sno是String类型（可能有些学号带有英文）。
		System.out.println(scoreDao.delete(student));
	}
	
	
	@Test
	public void findByNameTest() throws ClassNotFoundException{
		ScoreDao scoreDao = new ScoreDao();
		scoreDao.findByName("桓温");
	}
	
	
	
	

}
