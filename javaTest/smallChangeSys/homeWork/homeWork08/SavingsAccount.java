package com.javaTest.smallChangeSys.homeWork.homeWork08;

public class SavingsAccount extends BankAccount {
	
	private int counts = 3;
	private double rate = 0.01;
	public SavingsAccount(int balance) {
		super(balance);
	}

	@Override
	public void deposit(double amount) {
//		super.deposit(amount);
//		counts++;
		if (counts > 0) {
			super.deposit(amount);
		} else  {
			super.deposit(amount-1);
		}
		counts--;
	}

	@Override
	public void withDraw(double amount) {
//		super.withDraw(amount);
//		counts++;
		if (counts > 0) {
			super.withDraw(amount);
		} else  {
			super.withDraw(amount+1);
		}
		counts--;
	}
	
	public void earnMonthlyInterest() {//每个月初的，统计上个月的利息，同时将count=3

//		if(counts == 3) {
//			counts = 0;
//		}
		counts = 3;
		super.deposit(getBalance() * rate);
	}
}
