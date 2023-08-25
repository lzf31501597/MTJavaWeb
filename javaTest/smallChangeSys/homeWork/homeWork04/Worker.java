package javaTest.smallChangeSys.homeWork.homeWork04;

public class Worker extends Employee {


	public Worker(String name, double daySlaray, int dayCount, double grade) {
		super(name, daySlaray, dayCount, grade);
	}

	@Override
	public String printSalary() {
		return "普通员工："+ super.getName() +",工资:"
					+ super.getDayCount() * super.getDaySlaray() * super.getGrade();

	}


}
