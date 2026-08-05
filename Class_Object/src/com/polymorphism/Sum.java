package com.polymorphism;
//Overload sum() using different data types:

//sum(int, int)
//sum(float, float)

public class Sum {
	public void sum(int num1, int num2) {
		System.out.println("Sum of two numbers: " + (num1 + num2));
	}

	public void sum(float num1, float num2) {
		System.out.println("Sum Of two numbers : " + (num1 + num2));
	}

}
