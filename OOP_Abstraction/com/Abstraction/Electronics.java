package com.Abstraction;

public class Electronics extends Product {

	public Electronics(int pid, String pName) {
		super(pid, pName);
	}

	@Override
	public void calculateDiscount() {
		System.out.println("Calculating Discount of Elecctronics Products.");
	}

	@Override
	public void displayProductDetails() {
		System.out.println(" Clothing Product Id :" + pid);
		System.out.println("Clothing Product name:" + pName);
	}
}
