package com._2DArray;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
//		int even = 0;
		int arr[][];
		arr = new int[3][3];
//		int arr1[][] = { { 11, 21, 34 }, { 56, 75, 43 }, { 43, 65, 33 } };
//
////		System.out.println(arr1.length);// using for find length of array
//		for (int row = 0; row < arr1.length; row++) {
//			for (int col = 0; col < arr1.length; col++) {
//				if (arr1[row][col] % 2 == 0) {
//					even = arr1[row][col];
//					System.out.print(even + " ");
//				}
//			}
//		}
//		System.out.println();

		Scanner sc = new Scanner(System.in);

		System.err.println("Provide Input : ");

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] % 2 == 0) {

					System.out.println("even :" + arr[i][j]);
				} else {
					System.out.println("Odd :" + arr[i][j]);
				}
			}
			System.out.println();

		}
	}

}
