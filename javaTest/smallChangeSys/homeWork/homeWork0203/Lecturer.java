package javaTest.smallChangeSys.homeWork.homeWork0203;

public class Lecturer extends Teacher {

	public Lecturer(String name, int age, String post, double salary) {
		super(name, age, post, salary);
		

	}

	@Override
	public String introduce() {
		return "教师："+super.getName()+"，年龄："+super.getAge()
							+"，职称："+super.getPost()+"，基本工资："+super.getSalary()*1.1;
	}
	
}
