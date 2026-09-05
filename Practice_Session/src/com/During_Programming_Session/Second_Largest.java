package com.During_Programming_Session;

public class Second_Largest {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 4, 21, 11, 12, 43 };
		int secLarge = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secLarge = largest;
				largest = arr[i];
			} else if (arr[i] > secLarge && arr[i] != largest) {
				// secLarge = largest;
				secLarge = arr[i];
			}
		}
		System.out.println("Largest Element:" + largest);
		System.out.println("Second_Largest:" + secLarge);
	}

}
