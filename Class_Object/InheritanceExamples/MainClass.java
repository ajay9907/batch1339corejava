package com.oopsexamples;

public class MainClass {
	public static void main(String[] args) {

		B b = new B();
		b.showA();
		b.showB();

		System.err.println("--------------------");

		Y y = new Y();

		System.out.println("X value is : " + y.x);
		System.out.println("Y value is :" + y.y);

		System.err.println("--------------------");

		// if we want to access of super class for subclass then creating object as a
		// subclass.
		Dog d = new Dog();
		d.eat();
		d.bark();

		System.err.println("--------------------");
		Car c = new Car();
		c.start();
		c.drive();

		System.err.println("--------------------");
		Num2 n2 = new Num2();

		System.out.println("a : " + n2.a);
		System.out.println("b : " + n2.b);

		System.err.println("--------------------");
		C1 c1 = new C1();
		c1.showA();
		c1.showB();
		c1.showC();

		System.err.println("--------------------");

		Son s = new Son();
		System.out.println(" GrandParent is : " + s.a);
		System.out.println(" Parent is : " + s.b);
		System.out.println(" Son is : " + s.c);

		System.err.println("--------------------");
		SportsCar sc = new SportsCar();
		sc.vehicle();
		sc.car();
		sc.sportsCar();

		System.err.println("--------------------");
		Dog1 d1 = new Dog1();
		d1.eating();
		d1.moving();
		d1.bark();

		System.err.println("--------------------");
		Z z = new Z();
		z.display();

		System.err.println("--------------------");

		Child2 c2 = new Child2();
		System.out.println("--- Testing with Child2 Object ---");
		c2.p();
		c2.child2Information();
		c2.child1Inmform();
		c2.p();

		System.err.println("--------------------");

		Square sq = new Square();
		sq.type = "Ajay";
		sq.shape();
		sq.square();
		Circle cir = new Circle();
		cir.circle();
		cir.shape();
	}

}
