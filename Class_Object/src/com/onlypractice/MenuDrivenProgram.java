package com.onlypractice;

import java.util.Scanner;

//Menu-driven program:
//
//1. Check Even/Odd
//2. Check Prime
//3. Reverse Number
//Take choice using switch
//Perform selected operation
public class MenuDrivenProgram {
	public static void main(String[] args) {
		MenuDrivenProgram md = new MenuDrivenProgram();
		md.mainMenu();

	}

	public void mainMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Menu Driven Program ***");

		System.out.print("Enter number: ");
		int num = sc.nextInt();

		System.err.println("1.Check Even Odd \n2.Check Prime \n3.Check Reverse\n4.Exit ");

		System.out.print("Choice Otion : ");
		int key = sc.nextInt();
		System.out.println();

		switch (key) {

		case 1: {
			System.out.println(evenOdd(num));
			mainMenu();
			break;
		}
		case 2: {
			System.out.println(checkPrime(num));
			mainMenu();
			break;
		}
		case 3: {
			System.out.println("Reverse No : " + reversNo(num));
			mainMenu();
			break;
		}
		case 4: {
			System.out.println("Exit...!");
			break;
		}

		default: {
			System.err.println("Invalid Output.");
			mainMenu();
		}

		}
	}

	public String evenOdd(int num) {
		if (num % 2 == 0) {
			return "Even No is: " + num;
		}
		return "Odd No :" + num;
	}

	public String checkPrime(int num) {

		if (num <= 1) {
			return "Is not Prime.";
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return "Is not Prime.";
			}
		}
		return "Is Prime.";
	}

	public int reversNo(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		return rev;
	}

}
