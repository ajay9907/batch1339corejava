package com._2DArray;

public class Multiplication {
	public static void main(String[] args) {

		int mul = 1;
		int num[][];
		num = new int[3][2];
		int num1[][] = { { 2, 3 }, { 4, 4 }, { 7, 5 } };

//		System.out.println(num1.length);//using for find length

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				int val = num1[i][j];
				mul *= val;

			}
		}
		System.out.println(mul + " ");

	}

}
