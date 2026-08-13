package com.StarPatterns;

public class SolidPyramid {
	public static void main(String[] args) {
		int n = 5;
		for (int row = 1; row <= n; row++) {
			// for each row-->variables columns.
			// spaces
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			// printing stars.
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
