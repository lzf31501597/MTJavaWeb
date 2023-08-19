package javaTest.smallChangeSys.homeWork.homeWork05;

public class Teacher extends Employee {

	private double daySlaray;
	private int dayCount;
	
	public double getDaySlaray() {
		return daySlaray;
	}
	public void setDaySlaray(double daySlaray) {
		this.daySlaray = daySlaray;
	}
	public int getDayCount() {
		return dayCount;
	}
	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}
	
	public Teacher(String name, double slaray, double daySlaray, int dayCount) {
		super(name, slaray);
		this.daySlaray = daySlaray;
		this.dayCount = dayCount;
	}

	public String printSalary() {
		return "教师："+ super.getName() +",工资:" + (super.getSlaray()+ this.dayCount * this.daySlaray);
		
				
	}

}
