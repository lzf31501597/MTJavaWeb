package com.javaTest.polymorphic_.polyparameter;

public class Worker extends Employee {

	public Worker(String name, double mouthSalary) {
		super(name, mouthSalary);
		// TODO Auto-generated constructor stub
	}

	
	public void work() {
		System.out.println("员工："+super.getName()+",正在工作。。。。。。");
	}


	@Override
	public double getAnnual() {
		// TODO Auto-generated method stub
		return super.getAnnual();
	}
	
	
}
