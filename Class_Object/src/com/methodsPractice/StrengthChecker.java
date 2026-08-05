package com.methodsPractice;

//Password Strength Checker
//Method checkPassword(String password) → return strong/weak.

public class StrengthChecker {

	public String checkPass(String pass) {
		if (pass.length() >= 8) {
			return "Strong";

		} else {
			return "Weak";
		}
	}

}
