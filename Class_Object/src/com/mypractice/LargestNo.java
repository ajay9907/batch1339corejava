package com.mypractice;

public class LargestNo {
	public static void main(String[] args) {

		int num = 555;
		int num1 = 4499;
		int num2 = 687;

		if (num >= num1 && num >= num2) {
			System.out.println("Largerst No is: " + num);
		} else if (num1 >= num && num2 <= num1) {
			System.out.println("Largest No : " + num1);
		} else {
			System.out.println("Largest No :" + num2);
		}
	}
}
