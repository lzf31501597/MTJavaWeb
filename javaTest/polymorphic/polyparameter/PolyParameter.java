package javaTest.polymorphic.polyparameter;

public class PolyParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker tom = new Worker("tom",2500);
		Manager milan = new Manager("milan",5000,200000);
		PolyParameter polyParameter = new PolyParameter();
		polyParameter.showEmpAnnual(tom);
		polyParameter.showEmpAnnual(milan);
		
		polyParameter.testWork(tom);
		polyParameter.testWork(milan);
		
	}

	public void showEmpAnnual(Employee e) {
		System.out.println(e.getAnnual());
	}
	
	public void testWork(Employee e) {
		if(e instanceof Worker) {//向下转型
			((Worker) e).work();
		} else if (e instanceof Manager) {//向下转型
			((Manager) e).manager();
		} else {
			System.out.println("没有操作处理");
		}
	}
}

