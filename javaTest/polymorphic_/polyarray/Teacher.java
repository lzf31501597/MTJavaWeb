package com.javaTest.polymorphic_.polyarray;

public class Teacher extends Person{

	

	private double salary;

	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	


	@Override
	public String say() {
		return "老师：" +super.say() + "\t salary:" + salary;
		
	}
	
	public void teach() {
		System.out.println("老师：" + super.getName() + "，正在授课。。。。。。" );
	}

}
