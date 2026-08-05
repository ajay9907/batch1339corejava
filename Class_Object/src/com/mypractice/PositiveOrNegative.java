package com.mypractice;

//Write a program to check whether a number is positive, negative, or zero.
public class PositiveOrNegative {
	public static void main(String[] args) {

		int num = 0;
		if (num > 0) {
			System.out.println("Positive number: " + num);
		} else if (num < 0) {
			System.out.println("Negative number: " + num);
		}else {
			System.out.println("Zero :"+num);
		}
	}
}
