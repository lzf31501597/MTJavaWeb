package com.javaTest.smallChangeSys.homeWork.homeWork05;

public class Worker extends Employee {

	public Worker(String name, double slaray) {
		super(name, slaray);
	}

	public String printSalary() {
		return "工人："+ super.getName() +",工资:" + super.getSlaray() * super.getSlaMonth();
				
	}

}
