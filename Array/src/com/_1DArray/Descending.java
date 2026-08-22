package com._1DArray;

public class Descending {
	public static void main(String[] args) {

		int num[] = { 2, 3, 44, 32, 11, 334, 32 };

		int n = num.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
 				}
			}
		}
		System.out.println("You're Descending Order:");
		for (int i : num) {
			System.out.println(i);
//			System.out.println(num.hashCode());
//			System.out.println(System.identityHashCode(num));
		}

	}
}
