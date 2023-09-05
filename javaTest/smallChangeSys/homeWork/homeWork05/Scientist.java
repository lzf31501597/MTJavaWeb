package com.javaTest.smallChangeSys.homeWork.homeWork05;

public class Scientist extends Employee {
	
	private double bonus;

	public Scientist(String name, double slaray) {
		super(name, slaray);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String printSalary() {
		return "科学家："+ super.getName() +",工资:" + (super.getSlaray() * super.getSlaMonth()
		 +this.bonus) ;
		
				
	}
	

}
