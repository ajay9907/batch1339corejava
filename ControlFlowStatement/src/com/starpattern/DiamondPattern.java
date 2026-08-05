package com.starpattern;

public class DiamondPattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");// 
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");//*,

			}
			System.out.println();

			// Lower side Diamond Shape

		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
