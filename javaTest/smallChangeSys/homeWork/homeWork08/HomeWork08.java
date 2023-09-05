package com.javaTest.smallChangeSys.homeWork.homeWork08;

public class HomeWork08 {

	
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000);
		savingsAccount.deposit(100);//免利息
		savingsAccount.deposit(100);//免利息
		savingsAccount.deposit(100);//免利息
		System.out.println(savingsAccount.getBalance());//1300.0
		savingsAccount.deposit(200);//免息3次,收利息
		System.out.println(savingsAccount.getBalance());//1300.0 + 200 -1 = 1499.0

		//月初定时器自动调用计息方法earnMonthlyInterest()
		savingsAccount.earnMonthlyInterest();//月末计息，重新设置免息3次
		System.out.println(savingsAccount.getBalance());//1499.0+14.99=1513.99
		savingsAccount.withDraw(100);//免利息
		System.out.println(savingsAccount.getBalance());//1513.99-100=1413.99
		savingsAccount.withDraw(100);//免利息
		savingsAccount.withDraw(100);//免利息
		System.out.println(savingsAccount.getBalance());//1413.99-200=1213.99
		savingsAccount.deposit(200);//免息3次,收利息
		System.out.println(savingsAccount.getBalance());//1213.99+200-1=1412.99
	}
}
