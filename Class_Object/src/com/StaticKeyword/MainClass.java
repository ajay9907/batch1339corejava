package com.StaticKeyword;

import com.StaticKeyword.StaticClass.Xyz;

public class MainClass {
	public static void main(String[] args) {

		Student s = new Student(5, "Ajay");
		s.display();
		System.err.println("-----");
		Student s1 = new Student(4, "xyz");
		s1.display();
		System.err.println("-----");

		Student s2 = new Student(6, "abc");
		s2.display();

		System.err.println("-----");
		Bank b = new Bank();
		Bank.changeROI();
		b.display(5000);

		System.err.println("-----");
		Bank b1 = new Bank();
		Bank.changeROI();// if we have method as static then do not need to explicitly object creation
		b1.display(6000);

		System.err.println("-----");

		StaticClass sc = new StaticClass();
		sc.m1();
		StaticClass.Xyz xyz = new StaticClass.Xyz();
		xyz.m2();
	}

}
