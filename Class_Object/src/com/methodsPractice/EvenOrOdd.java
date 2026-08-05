package com.methodsPractice;

//Write a method that returns true if a number is even, else false.

public class EvenOrOdd {

	// Using Parameterized method with return type

	public int even_Odd(int num) {

		if (num % 2 == 0) {
			return num;
		} else {
			return num;
		}
	}
	// Parameterized method without return type

	public void even_Odd1() {
		int num = 5;
		if (num % 2 == 0) {
			System.out.println("Even: " + num);
		} else {
			System.out.println("False: " + num);
		}
	}// Using Non-Parameterized with return type method

	public boolean even_Odd2() {
		int num = 3;
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}// Using Non-Parameterized without return type

	public void even_Odd3() {
		int num = 7;
		if (num % 2 == 0) {
			System.out.println("Even no: " + num);
		} else {
			System.out.println("False no :" + num);
		}
	}

}
