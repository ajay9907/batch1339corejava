package com.methodsPractice;
//Find Maximum Number

//Method findMax(int a, int b, int c).

public class MaxNumber {
	public int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;

		} else if (b >= c && a <= b) {
			return b;

		}
		return c;

	}

}
