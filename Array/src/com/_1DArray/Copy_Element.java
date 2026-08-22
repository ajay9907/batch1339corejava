package com._1DArray;

public class Copy_Element {
	public static void main(String[] args) {

		int[] arr1 = { 22, 21, 45, 32, 54 };

		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];
		}
		System.out.println("All Elements Copy in One Array :");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}
}
