package com.StarPatterns;

public class SquarePattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// nested loop demo
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println("i =" + i + "" + " " + "j =" + j);
			}
			System.out.println();

		}
	}
}
