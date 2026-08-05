package com.Abstraction;

public class SavingsAccount extends BankAccount {
	@Override
	public void deposit(int amount) {
		System.out.println("Deposited Successfully in Your SavingAcccount :" + amount);
	}

	@Override
	public void calCulateInterest() {
		System.out.println("Rate Of Interest is 10% ");

	}

}
