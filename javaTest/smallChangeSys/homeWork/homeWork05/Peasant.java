package com.javaTest.smallChangeSys.homeWork.homeWork05;

public class Peasant extends Employee {

	public Peasant(String name, double slaray) {
		super(name, slaray);
	}

	public String printSalary() {
		return "农民："+ super.getName() +",工资:" + super.getSlaray() * super.getSlaMonth();
				
	}

}
