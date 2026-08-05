package com.saturdaypractice;
//15. ATM Machine Simulation

//Create ATM:
//Constructor â†’ initial balance
//Methods:
//deposit
//withdraw
//check balance
//Add condition for insufficient balance

public class Atm {
	double intialBal;

	public Atm(double d) {
		this.intialBal = d;

		System.out.println("Balance is: " + intialBal);

	}

	public void deposite(double amount) {
		intialBal += amount;
		System.out.println("Deposited Successfull: " + amount);
	}

	public void withdraw(double amount) {

		if (amount <= intialBal) {
			intialBal -= amount;
			System.out.println("Withdraw Succesfull: " + amount);
		} else {
			System.out.println("Insufficient Bal: " + amount);
		}
	}

	public void checkBal() {
		System.out.println("Your Current Bal is : " + intialBal);
	}

}
