package com.saturdaypractice;
//13. Power Calculation

//Create class:
//Constructor â†’ base, exponent
//Method â†’ calculate power without using Math.pow()

public class PowerCal {
	int base;
	int exponent;

	public PowerCal(int base, int exponent) {
		this.exponent = exponent;
		this.base = base;
	}

	public void power() {
		int result = 1;
		for (int i = 1; i <= exponent; i++) {
			result = result * base;
			System.out.println("Power : " + result);
		}

	}

}
