package com.saturdaypractice;

public class A {
	A a = new A();

	A() {

		System.out.println("A");
	}

	public static void main(String[] args) {
		A a = new B();
	}
}
