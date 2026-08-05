package com.starpattern;

public class FullPyramidStarPattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)// Control Rows -->5 Rows
		{
			for (int j = 1; j <= 5 - i; j++) {// Control columns ---> {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
