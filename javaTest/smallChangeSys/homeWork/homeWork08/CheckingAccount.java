package javaTest.smallChangeSys.homeWork.homeWork08;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(int balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		super.setBalance(super.getBalance()-1);
	}

	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		super.withDraw(amount);
		super.setBalance(super.getBalance()-1);
	}
	
	
	
}
