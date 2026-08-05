package com.methodsPractice;
//Prime Number Checker

//Method isPrime(int num) → return true/false.

public class Primeno {

	public boolean checkPrime(int num) {
		if (num <= 1) {
			return false;

		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}
}
