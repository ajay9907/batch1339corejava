package com.Abstraction;
//Food Delivery App (like Zomato/Swiggy)

//Create abstract class FoodOrder with:
//abstract method calculateBill()
//concrete method printReceipt()
//Subclasses:
//DineInOrder
//OnlineOrder

public abstract class FoodOrder {
	public abstract void calcBill();

	public void printReceipt() {
		System.out.println("Printing a Receipt of bill.");
	}
}
