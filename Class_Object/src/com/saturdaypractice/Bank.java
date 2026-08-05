package com.saturdaypractice;
//8. Bank Account

//Create BankAccount:
//Constructor â†’ accountNumber, balance
//Methods:
//deposit()
//withdraw()
//displayBalance()

public class Bank {
	int accountNo;
	double bal;

	public Bank(int accountNo, double bal) {
		this.accountNo = accountNo;
		this.bal = bal;
	}

	public void deposit(double amount) {

		bal = bal + amount;
		System.out.println("Deposited Successfull:");

	}

	public void withdraw(double amount) {
		bal = bal - amount;
		System.out.println("Withdraw Successfull: ");
	}

	public void displayBal() {
		System.out.println("Your Balance is :" + bal);
	}

}
