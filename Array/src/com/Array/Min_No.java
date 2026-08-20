package com.Array;

public class Min_No {
	public static void main(String[] args) {
		int[] num = { 23, 1, 244, 345, 343, 23 };

		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];

			}

		}
		System.out.println("minimum Number is :" + min);

	}

}
