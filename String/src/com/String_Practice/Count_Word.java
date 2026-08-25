package com.String_Practice;

import java.util.Scanner;

//Write a Java program to count the number of words in a String without using split() or any other word-counting inbuilt method.

public class Count_Word {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Output: ");
		String name = sc.nextLine();

		int count = 1;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == ' ') {
				count++;
			}

		}
		System.out.println("Counting Numbers Of :" + count);

	}
}
