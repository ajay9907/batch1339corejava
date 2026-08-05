package com.Abstraction;

public class DineInOrder extends FoodOrder {
	@Override
	public void calcBill() {
		System.out.println("Calculation Bill Of DineInOrder.");

	}

	@Override
	public void printReceipt() {
		System.out.println("Prints Recepts of DineInOrder");

	}
}
