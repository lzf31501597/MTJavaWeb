package com.javaTest.smallChangeSys.homeWork.homeWork0203;

public class Professor extends Teacher {

	public Professor(String name, int age, String post, double salary, double grade) {
		super(name, age, post, salary, grade);
		

	}

	@Override
	public String introduce() {
		return "教师："+super.getName()+"，年龄："+super.getAge() +"，职称："+super.getPost()
				+"，基本工资："+(super.getSalary() +", 工资级别:"+super.getGrade());
	}
	
}
