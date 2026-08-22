package com._1DArray;

public class Max_No {
	public static void main(String[] args) {

		int arr[] = { 34, 432, 344, 35, 654, 345 };

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
		}
		System.out.println("Max No :" + max);
	}

}
