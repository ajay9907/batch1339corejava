package com.Abstraction;

public class Clothing extends Product {
	public Clothing(int pid, String pName) {
		super(pid, pName);
	}

	@Override

	public void calculateDiscount() {
		System.out.println("Calculating Discount of Clothing Products.");
	}

	@Override
	public void displayProductDetails() {
		System.out.println("Clothing Product Id :" + pid);
		System.out.println("Clothing Product name:" + pName);
	}
}
