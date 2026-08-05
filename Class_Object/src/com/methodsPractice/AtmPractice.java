package com.methodsPractice;


//ATM System

//Create a method checkBalance() that displays account balance.

//Create a method withdrawAmount(double amount) to deduct balance.

public class AtmPractice {

	int avBalance=5000;
	int wBalance;

	public int checkBalance() {
		return avBalance;
	}

	public void withdraw(int amt) {
		if (amt > avBalance) {
			System.out.println("insufficent Balance");
		} else {
			avBalance -= amt;
              System.out.println(avBalance);
		}
	}

}
