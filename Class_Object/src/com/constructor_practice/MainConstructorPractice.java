package com.constructor_practice;

public class MainConstructorPractice {

	public static void main(String[] args) {
		Student s = new Student();
		s.display(5, "Ajay");

		System.err.println("-------------");

		Employee e = new Employee(5, "Xyz");
		e.display();

		System.err.println("-------------");
		Mobile m = new Mobile();
		m.display();
		Mobile m1 = new Mobile("Samsung ");
		m1.display();
		Mobile m2 = new Mobile("Vivo", 50000);
		m2.display();

		System.err.println("-------------");

		Bank b1 = new Bank(23456, "Atharv", 0);

		b1.display();
		b1.bal = b1.deposite(-1);
		b1.withdraw(800, b1.bal);

		System.err.println("-------------");
		Laptop l = new Laptop("Dell", 16, "Delli5");
		l.display();

		System.err.println("-------------");
		Circle c = new Circle(6);
		c.display();
		c.calArea();

		System.err.println("-------------");
		Rectangle r = new Rectangle(5, 6);
		r.calculateArea();
		r.calculatePerimeter();
		r.display();

		System.err.println("-------------");
		Product p = new Product(1000, "Laptop", 800);
		System.err.println("Before Discount:");
		p.display();
		p.applyDiscount(20);
		System.err.println("After Discount :");
		p.display();

		System.err.println("-------------");
		EmployeeSalary es = new EmployeeSalary(2, "Shravan", 40000);
		es.display();
		es.incremental(1000);
		es.deductSalary(2000);

	}

}
