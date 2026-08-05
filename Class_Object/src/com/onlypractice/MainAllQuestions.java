package com.onlypractice;

import java.util.Scanner;

public class MainAllQuestions {
	public static void main(String[] args) {
//		Bill b = new Bill();
//		System.out.println("Electricity bill : " + b.electricBill(102));
//
//		System.err.println("-------------");
//Using Scanner class for take input from user.
//		Student s = new Student();
//		s.subjectMarks();

//		System.err.println("-------------");
//
//		Scanner sc = new Scanner(System.in);
//
//		Product p = new Product();
//
//		System.err.println("Enter Information about your product.");
//		sc.nextLine();
//
//		System.out.println("Enter Name of Product : ");
//		String name = sc.nextLine();
//
//		System.out.println("Enter quantity of Product : ");
//		int quantity = sc.nextInt();
//
//		System.out.println("Enter Price of Product : ");
//		double price = sc.nextDouble();
//		sc.nextLine();
//
//		p.calTotalBill();

		System.err.println("-------------");

		Bank bank = new Bank();
		System.out.println("Initial Bank bal: " + bank.getBalance());
		System.out.println("Current bal: " + bank.getBalance());
		bank.setdeposite(1000);
		System.out.println("Current Bal: " + bank.getBalance());
		bank.setWithdraw(200);
		System.out.println("Final bal: " + bank.getBalance());

		bank.getBalance();

		System.err.println("-------------");
		Student2 s2 = new Student2();
		s2.setMarks("Ajay", 5);
		s2.getMarks();

		System.err.println("-------------");
		Area a = new Area();
		a.area(6);
		a.area(33.05, 44.54);
		a.area(5, 3);

		System.err.println("-------------");
		Car c = new Car();
		c.start();
		c.showSpeed();

		System.err.println("-------------");
		Manager m = new Manager();
		m.display("Ajay", 45000);
	}

}
