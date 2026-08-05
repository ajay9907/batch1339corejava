package com.polymorphism;
//. Can you overload the main() method? Write a program to prove it.

//Yes we can Overloaded main method with help of change parameters.

public class MainMethodOverload {
	public static void main(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		System.out.println(args);
	}

}
