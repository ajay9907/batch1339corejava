package com.Array;

public class Multiplication {

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4 };
		int ans = 1;
		int n = num.length;
		for (int i = 0; i < n; i++) {
			int value = num[i];
			ans = ans * value;
		}
		System.out.println("Multiplication of:  " + ans);
	}

}
