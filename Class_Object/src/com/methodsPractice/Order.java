package com.methodsPractice;

public class Order {
	public void placeOrder(String item, int quantity) {
	    int price = 100;   
	    int bill = price * quantity;

	    System.out.println("Item : " + item);
	    System.out.println("Quantity : " + quantity);
	    System.out.println("Total Bill : " + bill);
	}
}
