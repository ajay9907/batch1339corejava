package com._1DArray;

public class Ascending_Order {
	public static void main(String[] args) {

		int[] num = { 23, 223, 755, 78, 654, 90 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] >= num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

			}

		}
		System.out.println("Ascending Order Array :");
		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);
		}

	}

}
