package com.mypractice;
//Write a program to check whether a person is eligible to vote.

public class VoteEligibility {
	public static void main(String[] args) {

		int age = 12;

		if (age > 18 && age <= 110) {
			System.out.println("You can eligible for vote ...");
		} else if (age <= 17 && age <= 90) {
			System.out.println("Youre not Eligible :");
		} else {
			System.out.println("Invalid ..");
		}
	}
}
