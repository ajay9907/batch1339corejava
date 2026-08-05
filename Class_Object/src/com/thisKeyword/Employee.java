package com.thisKeyword;
//Programming Questions

//1. Use this to Resolve Variable Shadowing
//
//Create an Employee class with:
//
//id
//name
//
//Initialize them using a constructor and the this keyword.

public class Employee {
	int id;
	String name;

	public Employee() {
		this(10, "A");
		System.out.println("This is a Constructor.");
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

		System.out.println("Employee id: " + this.id);
		System.out.println("Employee name: " + this.name);

	}

}
