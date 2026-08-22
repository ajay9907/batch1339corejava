package com._1DArray;

public class LargestNo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int n = arr.length;
		int large = 0;
		for (int i = 0; i < n; i++) {
			if (large > arr[i]) {
				large = arr[i];

			}
		}
		System.out.println("Largest Number :" + large);
	}

}