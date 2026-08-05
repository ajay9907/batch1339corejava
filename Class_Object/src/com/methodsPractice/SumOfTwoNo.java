package com.methodsPractice;
//Write a method that returns the sum of two numbers.

public class SumOfTwoNo {

	int sum;
	int sum1;
	// Using Parameterized method with return type..

	public int sum1(int num, int num2) {
		int num3 = num + num2;
		return num3;

	}
	// Using Non-Parameterized method without return type

	// --Whenever we have using Non-Parameterized method without return type then
	// using void keyword ...
	// & void is does not return any value...

	public void sum2() {
		int num1 = 5, num2 = 6;
		System.out.println("Addition of two numbers:" + (num1 + num2));

	}
	// Using Parameterized method without return type

	public void sum3(int sum, int sum1) {
		return;
	}

	// Using Non-Parameterized method with return type

	public int sum4() {
		int num = sum + sum1;
		return num;
	}

}
