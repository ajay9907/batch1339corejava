package com.Abstraction;

//E-Commerce Platform (like Amazon)
//Create abstract class Product with:
//abstract method calculateDiscount()
//concrete method displayProductDetails()
//Subclasses:
//Electronics
//Clothing
public abstract class Product {
	int pid;
	String pName;

	public abstract void calculateDiscount();

	public Product(int pid, String pName) {
		this.pid = pid;
		this.pName = pName;
	}

	public void displayProductDetails() {
		System.out.println("Product Id : " + pid);
		System.out.println("Product Name :" + pName);
	}

}
