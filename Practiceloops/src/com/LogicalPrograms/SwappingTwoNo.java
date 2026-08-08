package com.LogicalPrograms;

//Swapping two numbers without third variable.
public class SwappingTwoNo {

	public static void main(String[] args) {
		int a = 12;
		int b = 14;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
	}

}
