package com.Array;

public class Even_Odd {
	public static void main(String[] args) {
		int[] arr = { 23, 45, 32, 23, 56, 432, 4 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even Numbers:" + arr[i]);
			}else {
				System.out.println("Odd:"+arr[i]);
			}
		}

	}

}
