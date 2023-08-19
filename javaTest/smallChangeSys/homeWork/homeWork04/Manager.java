package javaTest.smallChangeSys.homeWork.homeWork04;

public class Manager extends Employee {

	public Manager(String name, double daySlaray, int dayCount) {
		super(name, daySlaray, dayCount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String printSalary() {
		return "经理："+ super.getName() +",工资:" 
					+ super.getDayCount() * super.getDaySlaray() * 1.2;
		
	}

	
}
