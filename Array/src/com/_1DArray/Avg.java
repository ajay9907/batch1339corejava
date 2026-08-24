package com._1DArray;

import java.util.Scanner;

//Write a Java program to find the average of all elements in a 1D array.

public class Avg {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.err.println("Enter Your Input:");

		double avg = 0;
		int sum = 0;
		int arr[] = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			arr[i] = sum = sum + arr[i];
			avg = sum / arr.length;

		}
		System.out.println("avg=" + avg);
		System.out.println("Sum=" + sum);
	}

}
