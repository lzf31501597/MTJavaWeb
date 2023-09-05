package com.javaTest.smallChangeSys.homeWork.homeWork05;

public class HomeWork05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker worker = new Worker("worker", 3000);
		System.out.println(worker.printSalary());

		Peasant peasant = new Peasant("peasant", 3500);
		System.out.println(peasant.printSalary());

		Waiter waiter = new Waiter("waiter", 3800);
		System.out.println(waiter.printSalary());

		Teacher teacher = new Teacher("teacher", 6000, 13, 22);
		System.out.println(teacher.printSalary());

		Scientist scientist = new Scientist("scientist", 8000);
		scientist.setBonus(200000);
		System.out.println(scientist.printSalary());
	}

}
