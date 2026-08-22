package com._2DArray;

import java.util.Scanner;

public class DeclareArray_withScanner {
	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		Scanner sc = new Scanner(System.in);

		// i have used for take imput from user
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.err.println("Provides Elements for rows=" + i + "and col=" + j);

				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		// i have used for printing each row and column elements

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

}
