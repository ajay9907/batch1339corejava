package com.constructor_practice;

public class Mobile {
	String brand;
	int price;

	public Mobile() {
		System.out.println("Mobile Object Created.");
	}

	public Mobile(String brand) {
		this.brand = brand;

	}

	public Mobile(String brand, int price) {
		this.brand = brand;
		this.price = price;

	}

	public void display() {
		System.out.println("Mobile Brand is:" + brand);
		System.out.println("Price is : " + price);

	}

}
