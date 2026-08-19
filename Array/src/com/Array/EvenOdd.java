package com.Array;

public class EvenOdd {
	public static void main(String[] args) {

		int[] num = { 22, 3, 42, 32 };

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("Even Number:" + num[i]);
			} else {
				System.out.println("Odd Numbers:" + num[i]);
			}
		}
	}

}
