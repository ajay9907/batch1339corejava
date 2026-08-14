package com.LogicalPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number :");

		int num = sc.nextInt();

		int pal = num;
		int rev = 0;

		while (num > 0) {
			int digit;
			digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		if (pal == rev) {
			System.out.println("Is Palindrome Number :" + rev);
		} else {
			System.out.println("Is Not Palindrome Number :" + rev);
		}
	}
}
