package com._1DArray;

public class Sum_All_Elements {
	public static void main(String[] args) {

		int[] arr = { 21, 32, 34 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of All Elements:" + sum);
	}

}
