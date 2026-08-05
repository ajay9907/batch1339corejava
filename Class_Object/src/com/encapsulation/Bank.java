package com.encapsulation;

public class Bank {

	protected Bank()
	{
		
	}
    private double bal;

    //Using Method For Set Balance because of Initializing of objects
    
    public void setBalance(double bal) {
        this.bal = bal;
    }

    
    public void setDeposit(double amount) {
        if (amount > 0) {
            bal += amount;
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    
    public void setWithdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    
    public double getBalance() {
        return bal;
    }
}