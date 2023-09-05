package com.javaTest.smallChangeSys.homeWork.homeWork04;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double daySlaray, int dayCount, double grade) {
		super(name, daySlaray, dayCount, grade);

	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String printSalary() {
		return "经理："+ super.getName() +",工资:" 
					+ (this.bonus + super.getDayCount() * super.getDaySlaray() * super.getGrade());
		
	}

	
}
