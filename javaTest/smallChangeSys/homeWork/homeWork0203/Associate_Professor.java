package javaTest.smallChangeSys.homeWork.homeWork0203;

public class Associate_Professor extends Teacher {

	public Associate_Professor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String introduce() {
		return "教师："+super.getName()+"，年龄："+super.getAge()
							+"，职称："+super.getPost()+"，基本工资："+super.getSalary()*1.2;
	}

	
}
