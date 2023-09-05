package com.javaTest.polymorphic_.polyparameter;

public class Employee {

	private String name;
	private double mouthSalary;
	private double mouths = 12;
	
	public double getMouths() {
		return mouths;
	}

	public void setMouths(double mouths) {
		this.mouths = mouths;
	}

	public Employee(String name, double mouthSalary) {
		//super();
		this.name = name;
		this.mouthSalary = mouthSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMouthSalary() {
		return mouthSalary;
	}

	public void setMouthSalary(double mouthSalary) {
		this.mouthSalary = mouthSalary;
	}

	public double getAnnual() {
		return mouthSalary * mouths;
		
	}
}
