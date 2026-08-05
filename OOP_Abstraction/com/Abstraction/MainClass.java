package com.Abstraction;

public class MainClass {
	public static void main(String[] args) {

		BankAccount b = new CurrentAccount();
		b.deposit(10000);
		b.calCulateInterest();
		b = new SavingsAccount();
		b.deposit(12000);
		b.calCulateInterest();

		System.err.println("--------------");
		FoodOrder fo;
		fo = new DineInOrder();
		fo.calcBill();
		fo.printReceipt();
		System.err.println("-------------");
		fo = new OnlineOrder();
		fo.calcBill();
		fo.printReceipt();

		System.err.println("-------------");

		Ride r = new MiniRide();

		r.startRide();
		r.calculateFare(500);

		r = new PrimeRide();
		r.startRide();
		r.calculateFare(600);

		System.err.println("-------------");
		Product p;
		p = new Clothing(56, "T-shirt");
		p.calculateDiscount();
		p.displayProductDetails();

		p = new Electronics(23, "AC");
		p.calculateDiscount();
		p.displayProductDetails();

		System.err.println("-------------");
		DiscountPolicy dp;
		dp = new FestivalDiscount();
		dp.applyDiscount(2900);

		dp = new MemberDiscount();
		dp.applyDiscount(1500);

		System.err.println("-------------");

		Employee e;
		e = new FullTimeEmployee();
		e.employeeDetails();
		e.calculateSalary();

		e = new PartTimeEmployee();
		e.employeeDetails();
		e.calculateSalary();

	}

}
