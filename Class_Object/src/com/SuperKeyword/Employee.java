package com.SuperKeyword;

public class Employee extends Person {
	String name = "Rahul";

	public void show() {
		System.out.println("Child name is: " + this.name);
		System.out.println("Parent Name is : " + super.name);
	}
}
