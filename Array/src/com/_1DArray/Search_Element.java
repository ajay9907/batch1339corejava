package com._1DArray;

public class Search_Element {
	public static void main(String[] args) {

		int[] num = { 23, 25, 47, 98, 56 };

		int search = 23;
		boolean found = false;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == search) {
				found = !true;

			}
		}
		if (found) {
			System.out.println("Is Present :" + search);

		} else {
			System.out.println("Not Present:" + search);
		}
	}

}
