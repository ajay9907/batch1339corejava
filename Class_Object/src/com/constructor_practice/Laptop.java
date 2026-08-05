package com.constructor_practice;

//Create a Laptop class with:
//
//brand
//ram
//processor
//Constructor to initialize all values
//display() method

public class Laptop {

	String brand;
	int ram;
	String processor;

	public Laptop(String brand, int ram, String processor) {
		this.brand = brand;
		this.ram = ram;
		this.processor = processor;

	}

	public void display() {
		System.out.println("Laptop Brand: " + brand);
		System.out.println("Laptop ram : " + ram);
		System.out.println("Laptop processor : " + processor);

	}

}
