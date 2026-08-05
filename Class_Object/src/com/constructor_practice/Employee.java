package com.constructor_practice;
//Create an Employee class with:

//
//id
//name
//A parameterized constructor to initialize both values.
//A display() method to print the employee details.
//Do not use Scanner.
//Create the object in the main() method.

public class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {

		System.out.println("Employee Id Is:" + id);
		System.out.println("Employee name Is:" + name);

	}

}
