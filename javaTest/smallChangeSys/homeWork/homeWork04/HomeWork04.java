package javaTest.smallChangeSys.homeWork.homeWork04;

public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker("tom", 20, 22,1);
		System.out.println(worker.printSalary());
		
		Manager manager = new Manager("james", 25, 22,1.2);
		manager.setBonus(2000);
		System.out.println(manager.printSalary());
		
		
				
	}
	
	

	
}
