package com.String_Practice;

import java.util.Scanner;

//Write a Java program to count the number of vowels and consonants in a String.
public class Count_Vovels_Consonants {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");
		String name = sc.nextLine();

		int vovelCount = 0;
		int conCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vovelCount++;
			} else {
				conCount++;
			}

		}
		System.out.println("Vovels Is :" + vovelCount);
		System.out.println("Consonants Count is :" + conCount);
	}

}
