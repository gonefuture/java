package test.mysql.studentScore;

public class Student {
	String sno;
	String sname;
	int age;
	String gander;
	int math;
	int chinese;
	int english;
	
	public Student(){
		
	}
	
	public Student(String sno, String sname, int age, String gander, int math,
			int chinese, int english) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.age = age;
		this.gander = gander;
		this.math = math;
		this.chinese = chinese;
		this.english = english;
	}
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", age=" + age
				+ ", gander=" + gander + ", math=" + math + ", chinese="
				+ chinese + ", english=" + english + "]";
	}

	
}
