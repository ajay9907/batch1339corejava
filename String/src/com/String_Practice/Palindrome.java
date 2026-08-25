package com.String_Practice;

import java.util.Scanner;

//Write a Java program to check whether a String is a palindrome or not, without using any inbuilt reverse method.

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");

		String str = sc.nextLine();

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		if (str.equals(rev)) {
			System.out.println("Is Palindrome ");

		} else {
			System.out.println("Is Not Palindrome ");

		}

	}
}
