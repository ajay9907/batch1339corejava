package com.Abstraction;

public class OnlineOrder extends FoodOrder {

	@Override
	public void calcBill() {
		System.out.println("Calculation Bill Of Online Order.");

	}

	@Override
	public void printReceipt() {
		System.out.println("Prints Recepts of OnlineOrder");

	}
}
