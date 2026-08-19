package com.Array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

//		int[] num = { 22, 3, 42, 32 };
//
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 0) {
//				System.out.println("Even Number:" + num[i]);
//			} else {
//				System.out.println("Odd Numbers:" + num[i]);
//			}
//		}

		Scanner sc = new Scanner(System.in);

		int[] num = new int[4];

		System.err.println("Enter Numbers:");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0) {
				System.out.println("Number is Even: " + num[i]);
			} else {
				System.out.println("Number is Odd: " + num[i]);
			}

		}

	}

}
