package com._2DArray;

public class JaggedArray_Ex {
	public static void main(String[] args) {
		// declaration
		int arr[][];

		// allocation
		arr = new int[4][4];

		// initialization

		int[][] arr1 = { { 10, 20 }, { 45, 32, 56, 43 }, { 23, 12, 45, 67, 43, 67, 44, 98, 56 }, { 99 } };

		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				System.out.print(arr1[row][col] + " ");
			}
			System.out.println();

		}
	}

}
