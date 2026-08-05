package com.encapsulation;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person();
//
		// We Want to Dynamically Getting Input then I Used Scanner Class.

		Scanner sc = new Scanner(System.in);

//		System.err.println("Enter Person Information.");
//		System.err.println("----------------");
//
//		System.out.println("Enter Name: ");
//		String name = sc.nextLine();
//		sc.nextLine();
//
//		System.out.println("Enter Age: ");
//		int age = sc.nextInt();
//		sc.nextLine();
//
//		p.setName(name);
//		p.setAge(age);
//
//		System.err.println("Inform");
//		System.out.println("Person Name: " + p.getName());
//		System.out.println("Person Age: " + p.getAge());
//
//		System.err.println("-----------------");

		Bank b = new Bank();
		System.out.println("Enter Bank Details.");
		System.err.println("------------------");

		System.out.println("Enter Bal ");
		double bal = sc.nextDouble();
		b.setBalance(bal);

		System.out.println("Enter Deposite Amount: ");
		double deposite = sc.nextDouble();
		b.setDeposit(bal);

		System.out.println("Enter Withdraw Amount :");
		double withdraw = sc.nextDouble();
		b.setWithdraw(bal);

		System.err.println("------------");

		b.setDeposit(deposite);

		b.setWithdraw(withdraw);

		System.out.println(b.getBalance());

	}

}
