package com.opp.Atm;

public abstract class Account implements Transaction {

	int AccountNumber=123456789;
	String AccountHolderName="Ajay Don";
	private double Balance=15000;
	private int PIN=1234;
	
	public double getBalance() {
		return Balance;
	}
	
	public void setBalance(double balance) {
		Balance = balance;
	}

	public int getPIN() {
		return PIN;
	}
	
	
	public final boolean validatePin(int pin) {
		if(pin==PIN) {
			return true;
		}
		return false;
	}
	
	

}
