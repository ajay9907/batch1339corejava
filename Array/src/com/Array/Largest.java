package com.Array;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 112, 12, 3662, 45, 36, 533 };
		int n = arr.length;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Largest Number:" + max);

	}
}
