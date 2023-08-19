package javaTest.smallChangeSys.homeWork.homeWork05;

public class Scientist extends Employee {
	
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Scientist(String name, double slaray, double bonus) {
		super(name, slaray);
		this.bonus = bonus;
	}

	public String printSalary() {
		return "科学家："+ super.getName() +",工资:" + (super.getSlaray()+this.bonus) ;
		
				
	}
	

}
