package com.LogicalPrograms;
//Find the sum of numbers from 1 to 100.

public class SumOfNumbers {
	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;

			System.out.println("sum of numbers =" + sum);
		}

	}
}
