package com.saturdaypractice;
//12. Palindrome Check

//Create class:
//Constructor â†’ number
//Method â†’ check palindrome

public class Palindrome {
	int num;

	public Palindrome(int num) {
		this.num = num;
	}

	public void checkPalindrome() {
		System.out.println("Palindrome Number: ");
		while (num > 0) {
			int pal = num % 10;
			System.out.print(pal);
			num = num / 10;

		}
	}

}
