package com.String_Practice;

import java.util.Scanner;

//Write a Java program to reverse a String without using reverse() or any other reverse inbuilt method.

public class Reverse_String {

	static String getReverse() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You're String : ");
		String str = sc.nextLine();
		String rev = "";
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(getReverse());
	}
}
