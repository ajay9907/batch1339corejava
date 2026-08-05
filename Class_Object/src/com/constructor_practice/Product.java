package com.constructor_practice;

//Create a Product class with the following requirements:
//
//Instance Variables
//productId
//productName
//price
//Constructor
//Initialize all values using a parameterized constructor.
//Methods
//display()
//Print all product details.
//applyDiscount(int percent)
//Reduce the price by the given percentage.
//Example:
//Price = 1000
//Discount = 20%
//New Price = 800

public class Product {
	int productId;
	String productName;
	double price;

	public Product(int productId, String productName, double price) {
		// if we want to initialize value of instance variable then using this keyword.
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public void display() {
		System.out.println("Product Id: " + productId);
		System.out.println("ProductName: " + productName);
		System.out.println("Product Price: " + price);
		System.out.println();

	}

	public void applyDiscount(int percent) {
		double discount = (price * percent) / 100;
		price = price - discount;
		System.out.println("Discount applied %: " + percent);
		System.out.println("Discount amount: " + discount);
		System.out.println("Discount price: " + price);
		System.out.println();

	}

}
