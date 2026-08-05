package com.onlypractice;

//Salary > 25,000
//Age between 21–60
//If both true → Eligible
//Else → Not Eligible

public class LoanEligibility {

	public static void main(String[] args) {
		double salary = 25000;
		int age = 12;

		if (salary > 25000) {
			System.out.println("Youre Eligible for Loan.");

		} else if (age > 21 && age <= 60) {
			System.out.println("Eligible for Loan.");
		} else {
			System.out.println("Not Eligible for Loan  ");
		}

	}

}
