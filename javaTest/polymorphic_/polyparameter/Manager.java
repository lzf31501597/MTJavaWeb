package com.javaTest.polymorphic_.polyparameter;

public class Manager extends Employee {

	private double bonus;
	
	public Manager(String name, double mouthSalary, double bonus) {
		super(name, mouthSalary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void manager() {
		System.out.println("经理："+super.getName()+",正在进行管理工作。。。。。。");
	}

	@Override
	public double getAnnual() {
		// TODO Auto-generated method stub
		return super.getAnnual() +bonus;
	}
	
	
}
