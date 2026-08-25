package com.String_Practice;

//Write a Java program to reverse a String without using reverse() or any other reverse inbuilt method.

public class Reverse_String {

	static String getReverse(String str) {

		String rev = "";
		int n = str.length();
		for (int i = n - 1; i > 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}

	public static void main(String[] args) {
		String str = "Ajay Agwan";
		System.out.println(getReverse(str));
	}
}
