package com.Abstraction;
//Banking System

//Create an abstract class BankAccount with:
//variables: accountNumber, balance
//abstract method: calculateInterest()
//concrete method: deposit()
//Create subclasses:
//SavingsAccount
//CurrentAccount

public abstract class BankAccount {

	long accountNumber;
	double bal;

	public abstract void calCulateInterest();

	public void deposit(int amount) {
		System.out.println("Deposited Successfully in Your Acccount :" + amount);
	}
}
