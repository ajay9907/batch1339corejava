package com.onlypractice;

//Create a method calculateElectricityBill(int units):
//
//First 100 units → ₹5/unit
//Next 100 → ₹7/unit
//Above 200 → ₹10/unit
//Return total bill.

public class Bill {

	int bill;

	public int electricBill(int units) {
		if (units <= 100) {
			bill = units * 5;
		} else if (units > 100 && units <= 200) {
			bill += units * 7;
		} else {
			bill += units * 10;

		}
		return bill;
	}

}
