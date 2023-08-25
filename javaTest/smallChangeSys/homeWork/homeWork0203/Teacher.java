package javaTest.smallChangeSys.homeWork.homeWork0203;

public class Teacher {

	private String name;
	private int age;
	private String post;
	private double salary;
	//工资级别
	private double grade;
	
	public Teacher(String name, int age, String post, double salary, double grade) {
		//super();
		this.name = name;
		this.age = age;
		this.post = post;
		this.salary = salary;
		this.grade = grade;
	}
	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String introduce() {
		return "教师："+name+"，年龄："+age+"，职称："+post+"，基本工资："+salary+", 工资级别:"+grade;

		
	}
	
}
