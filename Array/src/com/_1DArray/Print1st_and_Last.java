package com._1DArray;

import java.util.Scanner;

//Print the first and last element of an array.

public class Print1st_and_Last {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Provides Input :");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int row = 0; row < arr.length; row++) {
			System.out.println("First Element :" + arr[0]);
			System.out.println("Last Element :" + arr[arr.length - 1]);

		}

	}
}
