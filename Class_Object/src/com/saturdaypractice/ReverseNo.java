package com.saturdaypractice;
//11. Number Reverse

//Create class:
//Constructor â†’ number
//Method â†’ reverse number

public class ReverseNo {

	int num;

	public ReverseNo(int num) {
		this.num = num;
	}

	public void reverseNo() {
		int rev = 0;

//		for (int i = 1; i < num; i++) {
//			int digit = num % 10;
//			rev = rev * 10 + digit;
//			num = num / 10;
//			System.out.println("Reverse no: ");
		// }
System.err.println("Reverse Number is :");
		while (num > 0) {
			rev = num % 10;
			System.out.print(rev);
			num = num / 10;

		}

	}
}
