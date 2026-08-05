package com.opp.Atm;

public interface Transaction {

	int sminBal=25000;
	int cminBal=1000;
	void deposit(double amount);

	void withdraw(double amount);

	void checkBalance();
}
