package com._1DArray;

public class Frequency {
	public static void main(String[] args) {
		int[] arr = { 23, 11, 45, 32, 76, 54, 38, 54 };
		int count = 1;
		boolean alreadyCount = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; i++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		if (alreadyCount) {
			System.out.println("Already Counted Elements: ");
		}

	}

	{

	}

}
