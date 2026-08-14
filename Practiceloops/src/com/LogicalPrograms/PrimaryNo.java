package com.LogicalPrograms;

import java.util.Scanner;

public class PrimaryNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number :");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Is Prime no");
		} else {
			System.out.println("Is not Prime.");
		}
	}

}
