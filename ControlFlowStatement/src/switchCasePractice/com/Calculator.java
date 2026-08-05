package switchCasePractice.com;

import java.util.Scanner;

//Create a calculator using switch.

public class Calculator {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter Your Choice.(+,-,*,/)");
//
//		String ch = sc.nextLine();
//
//		System.out.println("Enter First number : ");
//		int a = sc.nextInt();
//
//		System.out.println("Enter Second Number :");
//		int b = sc.nextInt();

		String cal = "+";
		int a = 10;
		int b = 20;
		switch (cal) {

		case "+": {

			System.out.println("Addition of  Two Number: " + (a + b));
			break;
		}
		case "-": {
			System.out.println("Substraction of  Two Number :" + (a - b));
			break;
		}
		case "*": {
			System.out.println("Multiplication of Two Number :" + (a * b));
			break;
		}
		case "/": {
			System.out.println("Division of Two Number: " + (a / b));
			break;

		}
		default: {
			System.out.println("Invalid Input.");

		}
		}

	}
}
//Note :

//switch : Using evaluate expression in switch case.
//
//default: default keywords means whenever not matches to the cases then default case are execute.
//
//
//if you want to the stop block of the code then using "break" keyword.
