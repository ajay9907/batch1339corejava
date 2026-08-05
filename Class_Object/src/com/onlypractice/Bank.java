package com.onlypractice;

//Create class BankAccount:
//
//Private variables: balance
//Methods:
//deposit(amount)
//withdraw(amount) (check balance)
//getBalance()
//Perform operations in main()

public class Bank {
	private double balance;

	public void setdeposite(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(" Succesfully deposited amount: " + balance);
		} else {
			System.out.println("Deposited amount is fail: " + balance);
		}

	}

	public void setWithdraw(int amount) {
		
		if (amount <balance) {
			balance -= amount;
			System.out.println("Sufficient Bal ");
		} else {
			System.out.println("Insufficient Bal.");
		}

	}

	public double getBalance() {
		return balance;
	}

}
