package com._2DArray;

public class Multiplication {
	public static void main(String[] args) {
		int sum = 0;
		int mul = 1;
		int num[][];
		num = new int[2][2];
		int num1[][] = { { 1, 2, 3 }, { 1, 2, 3 } };

//		System.out.println(num1.length);//using for find length

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				int val = num1[i][j];
				mul = mul * val;

			}
		}
		System.out.println(mul + " ");

	}

}
