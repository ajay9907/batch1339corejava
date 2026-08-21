package com.Array;

public class SmallestNumber {
	public static void main(String[] args) {

		int arr[] = { 12, 33, 54, -5, -100 };
		int n = arr.length;
		int min = arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}

		}
		System.out.println("Minimum Element :" + min);

	}

}
