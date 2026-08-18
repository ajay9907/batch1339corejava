package com.LogicalPrograms;

public class ArmStrong {

	boolean isArmstrong(int num) {

		int original = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += (digit * digit * digit);
			num /= 10;
		}

		if (sum == original) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		ArmStrong a = new ArmStrong();
		System.out.println(a.isArmstrong(153));
	}

}
