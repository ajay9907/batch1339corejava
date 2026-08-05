package com.onlypractice;

//Find highest among 4 numbers using nested if-else (no arrays)

public class LargestNo {
	public static void main(String[] args) {
		int a = 50;
		int b = 8000;
		int c = 885;
		int d = 0;

		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println("Highest Value : " + a);
				} else {
					System.out.println("Highest Value of :" + d);
				}
			} else {
				if (c > d) {
					System.out.println("Highest Value : " + c);
				} else {
					System.out.println("Highest Value :" + d);
				}
			}
		} else {
			if (b > c) {
				if (b > d) {
					System.out.println("Highest Value : " + b);
				} else {
					System.out.println("Highest Value : " + d);
				}
			} else {
				if (c > d) {
					System.out.println("Highest Value : " + c);

				} else {
					System.out.println("d");
				}
			}
		}
	}
}
