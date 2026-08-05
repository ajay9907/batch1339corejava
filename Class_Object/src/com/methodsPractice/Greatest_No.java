package com.methodsPractice;

//Write a method that returns the greatest of three numbers

public class Greatest_No {

	// Parameterized method without return type

	public void greatest_No(int num, int num1, int num2) {
		if (num >= num1 && num >= num2) {
			System.out.println("Greate number: " + num);
		} else if (num1 >= num2 && num2 <= num1) {
			System.out.println("Greate number :" + num1);
		} else {
			System.out.println("Greate number:" + num2);
		}
	}
//Using Parameterized method with return type

	public int greatest_No1(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}

	}

	// Non-parameterized method with return type

	public int greatest_NO2() {
		int a = 5;
		int b = 10;
		int c = 4;
		if (a >= b && a >= c) {
			return a;
		} else if (b >= c && a <= b) {
			return b;
		} else {
			return c;
		}
	}

	// Using Non-Parameter without return type
	public void greatest_NO3() {
		int x = 5;
		int y = 3;
		int z = 2;
		if (x >= y && x >= z) {
			System.out.println("Largest no : " + x);
		} else if (y >= z && x <= y) {
			System.out.println("Largest no : " + y);
		} else {
			System.out.println("Largest no : " + z);
		}
	}
}
