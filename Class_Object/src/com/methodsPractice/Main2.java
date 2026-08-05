package com.methodsPractice;

public class Main2 {

	public static void main(String[] args) {
		AtmPractice a1 = new AtmPractice();
		System.out.println(a1.checkBalance());
		a1.withdraw(50000);
		System.out.println("--------------------");

		Student s = new Student();
		System.out.println(s.calculatePercentage(89, 67, 97));

		Recharge r = new Recharge();
		r.recharge(600);
		System.out.println("--------------------");

		Farenheit f = new Farenheit();
		System.out.println(f.celsiusToFahrenheit(6));
		System.out.println("--------------------");

		Login l = new Login();
		System.out.println(l.login1("Ajayagwan@gmail.com", "@abc"));
		System.out.println("-------------------------------");
		Discount d = new Discount();
		System.out.println(" After Discount price is :" + d.dis(567890));

		System.out.println("-------------------------------");

		Salary sal = new Salary();
		System.out.println("Salary is :" + sal.salary(60000));
		System.out.println("-------------------------------");

		Bank b1 = new Bank();
		System.out.println("Intrest is " + b1.calculateInterest(10000, 7, 2));
		System.out.println("-------------------------------");

		Order o = new Order();
		o.placeOrder("jamun", 15);
		System.out.println("-------------------------------");
		Ebill e = new Ebill();
		System.out.println(e.calculateBill(154));

		System.out.println("-------------------------------");
		Voting v = new Voting();
		v.vote(20);
		System.out.println("-------------------------------");
		RideBooking rb = new RideBooking();
		System.out.println("Booking of ride:" + rb.calculateFare(600));

	}

}
