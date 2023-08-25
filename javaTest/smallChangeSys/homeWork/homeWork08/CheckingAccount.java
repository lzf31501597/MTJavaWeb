package javaTest.smallChangeSys.homeWork.homeWork08;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(int balance) {
		super(balance);
	}

	@Override
	public void deposit(double amount) {
		super.deposit(amount-1);
		//super.setBalance(super.getBalance()-1);
	}

	@Override
	public void withDraw(double amount) {
		super.withDraw(amount+1);
		//super.setBalance(super.getBalance()-1);
	}
	
	
	
}
