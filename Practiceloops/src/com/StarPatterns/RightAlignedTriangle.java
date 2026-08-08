package com.StarPatterns;

public class RightAlignedTriangle {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = i; j < 5; j++) {
				System.out.print(" ");// space printing
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");// column printing

			}
			System.out.println();

		}
	}
}
