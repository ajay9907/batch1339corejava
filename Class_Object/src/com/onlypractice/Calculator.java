package com.onlypractice;

import java.util.Scanner;

//Switch Case

//Q5.
//
//Create a calculator using switch:
//
//Input: two numbers + operator (+, -, *, /)
//Perform operation using switch

public class Calculator {
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.calculator();
	}

	Scanner sc = new Scanner(System.in);

	public void calculator() {

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number ");
		int num2 = sc.nextInt();

		System.out.println("Which Peroming operations.(+,-,*,/)");

		String ch = sc.next();
		switch (ch) {
		case "+": {
			System.out.println("Addition of:" + (num1 + num2));

			break;
		}
		case "-": {
			System.out.println("Substraction of :" + (num1 - num2));
			break;
		}
		case "*": {
			System.out.println("Multiplication of :" + (num1 * num2));
			break;
		}
		case "/": {
			// double div = num1 / num2;
			System.out.println("Division of:" + (num1 / num2));
			break;

		}
		default: {
			System.out.println("----Invalid Input ----");
			calculator();
		}

		}
	}
}
