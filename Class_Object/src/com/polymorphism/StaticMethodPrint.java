package com.polymorphism;

//Overload a static method print() with:
//one parameter
//two parameters
public class StaticMethodPrint {

	public static void print(int num) {
		System.out.println("One Parameter: " +num);
	}

	public static void print(int num, int num1) {
		System.out.println("two Parameter: "+ (num+num1));
	}

}
