package com._2DArray;

public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr;
		arr = new int[3][3];
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				int val = arr1[i][j];
				sum = sum + val;
			}
		}
		System.out.print(sum + " ");

	}
}
