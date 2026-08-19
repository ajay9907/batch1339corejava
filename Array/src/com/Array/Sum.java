package com.Array;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numbers: ");

//		int num[] = { 10 };
//		int num1[] = { 20 };
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("Addition Of Two Arrays:" + (num[i] + num1[i]));
//		}
		int num[] = new int[5];

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		System.out.println("Addition of All Elements:" + sum);
	}

}
