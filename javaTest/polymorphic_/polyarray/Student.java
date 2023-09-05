package com.javaTest.polymorphic_.polyarray;

public class Student extends Person{

	

	private double score;

	public Student(String name, int age, double score) {
		super(name, age);
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String say() {
		return "学生: "+super.say() + "\t score:" + score;
		
	}

	public void stuty() {
		System.out.println("学生：" + super.getName() + "，正在学习。。。。。。" );
	}
	

}
