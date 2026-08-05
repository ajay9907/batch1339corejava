package com.opp.Atm;

import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in);
	static Transaction s1;

	public static void main(String[] args) {
		mainMenu();

	}

	static void mainMenu() {
		System.out.println("=======ATM Menu=======");
		System.out.println("1.Saving Account " + "\n2. Current Account " + "\n3.Exit ");
		System.out.print("Enter Your Choice:");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			checkPin(1);
			break;
		case 2:
			checkPin(2);
			break;
		case 3:
			System.out.println("Exit..!\n ----Thank you for using Atm----");
			break;
		default:
			System.out.println("Invalid Input...!");
		}

	}

	public static void checkPin(int ch) {
		System.out.println("------------------");

		System.out.println("Enter your Pin:");
		int pin = sc.nextInt();
		Savings s = new Savings();
		if (s.validatePin(pin)) {
			if (ch == 1) {
				SavingAccount();
			} else {
				CurrentAccount();
			}
		} else {
			System.out.println("Incarrect PIN");
			checkPin(ch);
		}
	}

	public static void CurrentAccount() {
		boolean flag = true;
		while (flag) {

			// Current s1 = new Current();
			s1 = new Current();

			System.out.println("------------------");

			System.out.println("Current Account");
			System.out.println("1.Withdraw amount \n2. deposit Amount \n3.CheckBal\n4.Back");
			System.out.print("Enter Your Choice :");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("withdraw Amount:");
				double amount = sc.nextDouble();
				s1.withdraw(amount);
				break;
			case 2:
				System.out.println("Deposit Amount:");
				double amount1 = sc.nextDouble();
				s1.deposit(amount1);
				break;
			case 3:
				s1.checkBalance();
				break;
			case 4:
				flag = false;
				mainMenu();
				break;
			default:
				System.out.println("Invalid Input..!");

			}
		}
	}

	public static void SavingAccount() {
		boolean flag = true;
		while (flag) {

			s1 = new Savings();
			System.out.println("------------------");

			System.out.println("Saving Account");
			System.out.println("1.Withdraw amount \n2. deposit Amount \n3.CheckBal\n4.Back");
			System.out.print("Enter Your Choice :");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("withdraw Amount:");
				double amount = sc.nextDouble();
				s1.withdraw(amount);
				break;
			case 2:
				System.out.println("Deposit Amount:");
				double amount1 = sc.nextDouble();
				s1.deposit(amount1);
				break;
			case 3:
				s1.checkBalance();
				break;
			case 4:
				flag = false;
				mainMenu();
				break;
			default:
				System.out.println("Invalid Input..!");

			}
		}
	}

}
