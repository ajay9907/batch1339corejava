package com.polymorphism;

//Create a class Calculator and overload add() to add:
//two integers
//three integers

public class Calculator {

	public void add(int num1, int num2) {
		// Addition Of 2 numbers
		int num3 = num1 + num2;
		System.out.println("Addition of Two Numbers :" + num3);

	}

	public void add(int num1, int num2, int num3) {
		//Addition of three numbers 
		int d = num1 + num2 + num3;
		System.out.println("Addition Of Three Numbers: " + d);

	}

}
