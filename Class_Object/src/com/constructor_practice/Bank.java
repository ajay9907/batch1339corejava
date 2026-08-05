package com.constructor_practice;

//Create a BankAccount class with the following:
//
//Instance Variables
//accountNo
//accountHolderName
//balance
//Constructors
//Default constructor
//Print "Bank Account Created"
//Parameterized constructor
//Accept accountNo, accountHolderName, and balance.
//Initialize all instance variables using the this keyword.
//Methods
//display()
//Print all account details.
//deposit(double amount)
//Add the amount to the balance.
//Print the updated balance.
//withdraw(double amount)
//If the balance is sufficient, subtract the amount.
//Otherwise print "Insufficient Balance"

public class Bank {
	int accNo;
	String accHolderName;
	double bal;

	public Bank() {
		System.out.println(" Bank Account Created .");

	}

	public Bank(int accountNo, String accountHolderName, double balance) {
		this.accHolderName = accountHolderName;
		this.accNo = accountNo;
		this.bal = balance;

	}

	public void display() {
		System.out.println("Account Num :" + accNo);
		System.out.println("Account HolderName :" + accHolderName);
		System.out.println("Account Balance  :" + bal);

	}

	public double deposite(double amount) {
		if (0 <= amount) {
			// bal += amount;
			// System.out.println("Updated Balance: " + bal);
		} else {
			System.out.println(" Less than zero..." + bal);
		}
		return bal;

	}

	public void withdraw(double amount, double bal) {

		if (bal >= amount) {
			bal -= amount;

			System.out.println("Sufficient amount:" + bal);
		} else {
			System.out.println("Insufficient amount:" + bal);
		}

	}
}