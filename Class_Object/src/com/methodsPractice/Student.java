package com.methodsPractice;
//Student Result

//Create a method calculatePercentage(int m1, int m2, int m3) that returns percentage.

public class Student {
	int m1, m2, m3;

	public int calculatePercentage(int m1, int m2, int m3) {
		int total = m1 + m2 + m3;
		int per = (total * 100) / 300;
		return per;
	}
}
