package com.Array;

public class Remove_Elements {
	public static void main(String[] args) {
		int num[] = { 23, 43, 22, 33, 44, 23, 45, 64, 54, 45, 44 };
		int n = num.length;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (num[i] == num[j]) {

					System.out.println("Removing Duplicate Elements: " + num[j]);

					for (int k = j; k < n - 1; k++) {
						num[k] = num[k + 1];
					}

					n--;
					j--;
				}
			}
		}

		for (int b = 0; b < n; b++) {
			System.out.println(num[b]);
		}
	}
}
