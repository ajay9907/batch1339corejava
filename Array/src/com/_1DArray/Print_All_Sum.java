package com._1DArray;

import java.util.Scanner;

//Write a Java program to find the sum of all elements in a 1D array without using any inbuilt methods.

public class Print_All_Sum {

	public static void main(String[] args) {
		int sum = 0;
		int val = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Input :");

		int arr[] = new int[5];

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			val = sum;
			System.out.println(val + " ");
		}
	}

}
