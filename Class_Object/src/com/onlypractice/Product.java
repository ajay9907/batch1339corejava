package com.onlypractice;

import java.util.Scanner;

//Take input://Using scanner class.
//
//Product name, quantity, price
//Calculate total bill
//If bill > 5000 → apply 10% discount
//Print final amount

public class Product {

	String name;
	int quantity;
	double price;

	public void calTotalBill() {
		double totBill;
		totBill = quantity * price;
		double dis = 0;

		if (totBill >= 5000) {
			dis = totBill * 0.10;
			System.out.println("Youre Appling discount of 10 % " + dis);

		}
		double finalBill = totBill - dis;

		System.out.println("Name Of Product : " + name);
		System.out.println("Quantity  Of Product : " + quantity);
		System.out.println("Price of Product : " + price);

	}

}
