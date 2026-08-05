package com.saturdaypractice;

//17. Electricity Bill
//Create ElectricityBill:
//Constructor â†’ units
//Method â†’ calculate bill:
//0â€“100 â†’ â‚¹5/unit
//101â€“200 â†’ â‚¹7/unit
//200+ â†’ â‚¹10/unit

public class ElectricityBill {
	int unit;

	public ElectricityBill(int u) {
		this.unit = u;

	}

	public void bill() {
		double bill = 0;

		if (unit <= 100) {
			bill = unit * 5;
			System.out.println("Electricity Bill :" + bill);

		} else if (unit <= 200) {
			bill = unit * 7;
			System.out.println("Electricity Bill :" + bill);

		} else {
			bill = unit * 10;

			System.out.println("Electricity Bill :" + bill);
		}

	}

}
