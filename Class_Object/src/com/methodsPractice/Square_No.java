//Write a method that returns the square of a number.

package com.methodsPractice;

public class Square_No {
	int num;// It is global variable We can access out of method and whole class
	
	// Using parameterized method without return type

	public void Sqauare(int num) {

		System.out.println("Sqare Of This Number:" + num * num);
	}

	// Non-Parameterized Method Without return type.
	public void Square() {
		int num = 6;
		System.out.println("Suare of number:" + num * num);

	}

	// Parameterized method with return type

	public int square_No1(int num) {
		return num * num;

	}
	// Non- Parameterized method with return Type

	public int square_No2() {
		int num1=num*num;
		return num1;// It is does not reurn any value bcoz this is void method --->without return
				// type method
	}

}
