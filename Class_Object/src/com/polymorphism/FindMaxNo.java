package com.polymorphism;

//Create a method max() to find maximum of:
//two numbers
//three numbers

public class FindMaxNo {
	public void max(int num, int num1) {
		if (num >= num1) {
			System.out.println("Max number :" + num);
		} else {
			System.out.println("max num: " + num1);
		}
	}

	public void max(int num, int num1, int num2) {
		if (num >= num1 && num >= num2) {
			System.out.println("Max number " + num);
		} else if (num1 >= num && num1 >= num2) {
			System.out.println("max number " + num1);

		} else {
			System.out.println("max no: " + num2);
		}

	}

}
