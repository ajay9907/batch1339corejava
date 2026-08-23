package com._1DArray;

import java.util.Scanner;

//Write a Java program to print the elements that are present at even indexes of a 1D array.

public class Print_Even {
	public static void main(String[] args) {
		int arr[];
		arr = new int[4];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Input ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {

				System.out.print("Even "+arr[i] + " ");
			}
		}

//		int num[] = { 12, 32, 11, 5, 7 };
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 0) {
//				System.out.println("Even No: " + num[i]);
//			} else {
//				System.out.println("Odd No:" + num[i]);
//			}
//		}
	}

}
