//1. Write a method to print your name (no return, no parameters).
//Create method to print your name
//Create method to add two numbers
//Create method to check even or odd
//Create method to find square of number
//Create method to return largest of two numbers

package com.onlypractice;

public class Practice_Method {
	String name;
	int a, b;
	int num;

	public String largestNumber() {
		if (a > b) {
			return "It is less number:"+a; //
		} else {
			return "It is grather number:"+b;//20
		}
		// return s;
	}

	public void printName() {
		// String name;

		System.err.println("Print Name: " + name);
	}

	public void addTwoNumbers() {
		// int a, b;
		System.err.println("Add Two Numbers:" + (a + b));
	}

	public void evenOdd() {
		if (num % 2 == 0) {
			System.out.println("Even:" + num);
		} else {
			System.out.println("Odd:" + num);
		}

	}

	public void square() {
		System.out.println(num * num);
	}

}
