package javaTest.smallChangeSys.homeWork.homeWork08;

public class BankAccount {
	
	private int balance;

	public BankAccount(int balance) {
		//super();
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withDraw(double amount) {
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
