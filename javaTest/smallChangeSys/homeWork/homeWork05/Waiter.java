package com.javaTest.smallChangeSys.homeWork.homeWork05;

public class Waiter extends Employee {

	public Waiter(String name, double slaray) {
		super(name, slaray);
	}
	
	public String printSalary() {
		return "服务生："+ super.getName() +",工资:" + super.getSlaray() * super.getSlaMonth();
				
	}
}
