package javaTest.smallChangeSys.homeWork.homeWork04;

public class Employee {

	private String name;
	private double daySlaray;
	private int dayCount;
	
	
	public Employee(String name, double daySlaray, int dayCount) {
		super();
		this.name = name;
		this.daySlaray = daySlaray;
		this.dayCount = dayCount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


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


	public String printSalary() {
		return "姓名："+ name +",工资:" + dayCount * daySlaray ;
		
				
	}

}
