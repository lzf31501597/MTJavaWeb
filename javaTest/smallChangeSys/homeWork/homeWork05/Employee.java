package javaTest.smallChangeSys.homeWork.homeWork05;

public class Employee {

	private String name;
	private double slaray;
	private int slaMonth = 12;


	public Employee(String name, double slaray) {
		this.name = name;
		this.slaray = slaray;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSlaray() {
		return slaray;
	}


	public void setSlaray(double daySlaray) {
		this.slaray = slaray;
	}

	public int getSlaMonth() {
		return slaMonth;
	}

	public void setSlaMonth(int slaMonth) {
		this.slaMonth = slaMonth;
	}


	public String printSalary() {
		return "姓名："+ name +",工资:" + slaray * slaMonth;
				
	}

}
