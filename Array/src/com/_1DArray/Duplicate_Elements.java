package com._1DArray;

public class Duplicate_Elements {
	public static void main(String[] args) {

		int arr[] = { 23, 32, 56, 54, 7, 65, 43, 32, 34, 54 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Values :" + arr[i]);
				}
			}
		}
	}
}
