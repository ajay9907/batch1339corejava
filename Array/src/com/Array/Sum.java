package com.Array;

public class Sum {
	public static void main(String[] args) {

//		int num[] = { 10 };
//		int num1[] = { 20 };
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("Addition Of Two Arrays:" + (num[i] + num1[i]));
//		}
		int num[] = { 10, 20, 30, 40, 50 };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Addition of All Elements:" + sum);
	}

}
