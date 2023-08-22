package javaTest.smallChangeSys.homeWork.homeWork08;

public class SavingsAccount extends BankAccount {
	
	int counts = 0;

	public SavingsAccount(int balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
		counts++;
	}

	@Override
	public void withDraw(double amount) {
		// TODO Auto-generated method stub
		super.withDraw(amount);
		counts++;
	}
	
	public void earnMonthlyInterest() {
		if(counts == 3) {
			counts = 0;
		}
	}
}
