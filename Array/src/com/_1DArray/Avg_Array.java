package com._1DArray;

public class Avg_Array {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int n = arr.length;
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += arr[i];
			avg = sum / arr.length;
		}
		System.out.println("Avg Of ALL Elements :" + avg);
	}

}
