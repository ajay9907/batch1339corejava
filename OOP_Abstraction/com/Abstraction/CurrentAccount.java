package com.Abstraction;

public class CurrentAccount extends BankAccount {
	@Override
	public void calCulateInterest() {
		System.out.println("Rate of interest is 12%");
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Successfully Deposited Amount in Current Account: " + amount);

	}
}
