package com.StaticKeyword;
//Create program:

//Outer class
//static nested class
//method inside nested class prints a message
//Call nested class method from main.

public class StaticClass {
	public void m1() {
		System.out.println("this is an Outer class.");
	}

	public static class Xyz {
		public void m2() {
			System.out.println("This is an Inner class.");
		}

	}
}
