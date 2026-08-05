package com.saturdaypractice;
//14. Max of Three Numbers

//Create class:
//Constructor â†’ 3 numbers
//Method â†’ find largest

public class MaxNo {
	int num1, num2, num3;

	public MaxNo(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void findLargest() {
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Largest Number Is: " + num1);

		} else if (num2 >= num1 && num2 <= num3) {
			System.out.println("Largest Number Is: " + num1);

		} else {
			System.out.println("Largest Number Is: " + num3);
		}
	}
}
