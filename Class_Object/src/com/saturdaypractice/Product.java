package com.saturdaypractice;

import java.util.Dictionary;

import com.methodsPractice.Discount;

//9. Product Discount

//Create Product:
//Constructor â†’ price
//Method â†’ apply 10% discount if price > 1000

public class Product {

	double price;

	public Product(double price) {
		this.price = price;
	}

	public void discount() {

		if (price > 1000) {

			double discount = (price * 10 / 100);
			double finalPrice = price - discount;
			System.out.println("Applying Discount of  10% :" + discount);
			System.out.println("Final Price: " + finalPrice);
		} else {
			System.out.println("No Discount: ");
			System.out.println("Final Price: " + price);

		}
	}

}
