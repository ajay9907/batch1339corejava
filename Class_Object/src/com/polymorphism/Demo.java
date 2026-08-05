package com.polymorphism;
//Create a class Demo and overload show() using:

//(int, String)
//(String, int)

public class Demo {
	public void show(int a, String name) {
		System.out.println(" IntFirst: " + " " + a + " ," + " StringSecond : " + " " + name);
	}

	public void show(String name, int a) {
		System.out.println(" StringFirst: " + " " + name + " ," + " IntSecond : " + " " + a);

	}
}
