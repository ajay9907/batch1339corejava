package com.LogicalPrograms;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number :");
		int num = sc.nextInt();

		System.out.print("Enter Number :");
		int num2 = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.println("Fibonacci Number :" + num);
			int num3 = num + num2;
			num = num2;
			num2 = num3;

		}
	}

}
