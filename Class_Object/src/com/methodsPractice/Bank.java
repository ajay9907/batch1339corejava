package com.methodsPractice;
//Bank Interest

//Method calculateInterest(double principal, double rate, int time).

public class Bank {
	public double calculateInterest(double principal, double rate, int time) {
	    double interest = (principal * rate * time) / 100;
	    return interest;
	}}
