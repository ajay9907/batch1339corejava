package com.String_Test;

// It is include String , String Bufffer and Builder 

public class String_Test {
	public static void main(String[] args) {

		String s1 = "Ajay";
		String s2 = new String("AGWAN");
//		System.out.println(s1.charAt(3));// find index of particular elements

//		System.out.println(s1.codePointAt(0));//unicode ascii value
//		System.out.println(s1.codePointBefore(1));
		// System.out.println(s1.codePointCount(5, 11));// Returns the number of Unicode

		// System.out.println(s1.compareTo(""));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s2.concat("Beed"));
	}

}
