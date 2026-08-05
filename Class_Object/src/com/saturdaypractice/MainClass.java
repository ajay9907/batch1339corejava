package com.saturdaypractice;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student("Ajay", 35);
		s.displayresult();

		System.err.println("----------------------------");
		Rectangle r = new Rectangle(5, 6);
		r.calculateArea();

		System.err.println("----------------------------");
		EmployeeSalary es = new EmployeeSalary("Ajay", 35000);

		System.out.println("Employee name: " + es.name);
		System.out.println("Employee Basic Salary: " + es.bSalary);
		System.out.println("Total Salary: " + es.totSalary());

		System.err.println("----------------------------");

		Circle c = new Circle(6);
		c.area();
		c.circumference();

		System.err.println("----------------------------");
		Interest i = new Interest(10000, 5, 2);
		System.out.println("Principle : " + i.principle);
		System.out.println("Rate " + i.rate);
		System.out.println("Time: " + i.time);
		i.calculateSI();

		System.err.println("----------------------------");

		EvenOrOdd eo = new EvenOrOdd(6);
		eo.check();
		EvenOrOdd eo1 = new EvenOrOdd(5);
		eo1.check();

		System.err.println("----------------------------");

		TempratureConvert temp = new TempratureConvert(25);
		temp.convert();

		System.err.println("----------------------------");
		Bank b = new Bank(456263, 5000);
		b.displayBal();
		b.deposit(2000);
		b.displayBal();
		b.withdraw(1000);
		b.displayBal();

		System.err.println("----------------------------");
		Product p = new Product(1200);
		p.discount();
		Product p1 = new Product(500);
		p1.discount();

		System.err.println("----------------------------");
		Grade g = new Grade(30);
		System.out.println(g.grade());

		System.err.println("----------------------------");
		ReverseNo rn = new ReverseNo(123);
		rn.reverseNo();
		System.err.println("----------------------------");
		Palindrome pn = new Palindrome(453);
		pn.checkPalindrome();

		System.err.println("----------------------------");
		PowerCal pr = new PowerCal(2, 5);
		pr.power();

		System.err.println("----------------------------");
		MaxNo mn = new MaxNo(-11, -23, -44);
		mn.findLargest();

		System.err.println("----------------------------");
		Atm a = new Atm(1200);
		a.deposite(5000);
		a.withdraw(1000);
		a.checkBal();

		System.err.println("----------------------------");
		Shopping shop = new Shopping(5500, 5);
		shop.calBill();

		System.err.println("----------------------------");
		ElectricityBill eb = new ElectricityBill(20);
		eb.bill();

		System.err.println("----------------------------");
		FibonacciSeries fs = new FibonacciSeries(1, 0);
		fs.fSeries();

		System.err.println("----------------------------");
		PrimeNo prime = new PrimeNo(11);
		prime.checkPrime();

		System.err.println("----------------------------");
		Library l = new Library("java", true);
		l.issueBook();
		l.returnBook();
		l.issueBook();
		l.returnBook();

	}

}
