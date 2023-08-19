package javaTest.smallChangeSys.homeWork.homeWork05;

public class HomeWork05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee worker = new Worker("worker", 3000);
		System.out.println(worker.printSalary());
		
		Employee peasant = new Peasant("peasant", 3500);
		System.out.println(peasant.printSalary());
		
		Employee waiter = new Waiter("waiter", 4500);
		System.out.println(waiter.printSalary());
		
		Employee teacher = new Teacher("teacher", 5000, 50, 22);
		System.out.println(teacher.printSalary());
		
		Employee scientist = new Scientist("scientist", 8000, 5000);
		System.out.println(scientist.printSalary());
	}

}
