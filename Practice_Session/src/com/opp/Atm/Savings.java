package com.opp.Atm;

public class Savings extends Account {

	@Override
	public void deposit(double amount) {
		if (sminBal <= amount) {
			setBalance(amount + getBalance());
			checkBalance();
		} else {
			System.out.println("Minimum Should be balance 25000.");
		}
	}

	@Override
	public void withdraw(double amount) {

		if ((amount <= getBalance())) {
			double newbal = getBalance() - amount;
			setBalance(newbal);
			System.out.println("Withdraw Amount Successfully:" + amount);
			checkBalance();
		} else {
			System.err.println("Insufficent Balance.");
		}

	}

	@Override
	public void checkBalance() {
		System.out.println("Balance:" + getBalance());

	}
}
