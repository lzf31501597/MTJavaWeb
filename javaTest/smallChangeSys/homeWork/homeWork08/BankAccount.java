package javaTest.smallChangeSys.homeWork.homeWork08;

public class BankAccount {
	
	private double balance;

	public BankAccount(double balance) {
		//super();
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withDraw(double amount) {
		balance -= amount;
	}


	
	
	
}
