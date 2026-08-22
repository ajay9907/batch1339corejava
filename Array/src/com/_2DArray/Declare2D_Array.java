package com._2DArray;

public class Declare2D_Array {
	public static void main(String[] args) {

		int arr[][];
		arr = new int[3][3];

		int brr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr.length; j++) {
				System.out.println(brr[i][j]);

			}
		}

	}
}

//}
