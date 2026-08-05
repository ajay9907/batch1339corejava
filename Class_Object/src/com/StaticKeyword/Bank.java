package com.StaticKeyword;
//Create a class Bank:

//static variable: rateOfInterest
//static method to change ROI
//non-static method to display account balance + ROI
//Call methods and observe behavior.

public class Bank {
	static double rateOfInterest;
	static void changeROI() {
		rateOfInterest=9;
		System.out.println(rateOfInterest);

	}

	public void display(double bal) {
		bal += rateOfInterest;
		System.out.println("Bal: " + bal);
		System.out.println("Rate of Interest : " + rateOfInterest);
	}

}
