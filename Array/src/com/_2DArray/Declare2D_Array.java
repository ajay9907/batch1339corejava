package com._2DArray;

public class Declare2D_Array {
	public static void main(String[] args) {

		int arr[][];
		arr = new int[3][3];

		int brr[][] = { { 10, 20, 30 }, { 40, 50, 60, 50, 43, 55 }, { 70 } };
//		for (int i = 0; i < brr.length; i++) {
//			for (int j = 0; j < brr.length; j++) {
//				System.out.println(brr[i][j]);
//
//			}
//		}
		
		//
		for (int rowIndex = 0; rowIndex <= brr.length - 1; rowIndex++) {
			for (int colIndex = 0; colIndex <= brr[rowIndex].length - 1; colIndex++) {
				System.out.print(brr[rowIndex][colIndex] + " ");
			}
			System.out.println();
		}
	}
}

//}
