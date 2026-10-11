package com.Interview_String;

public class ReverseEach_Word {
	public static void main(String[] args) {
		String str = "Java is Programming Language";
		String rev_w = "";
		// Reversing each Word
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				rev_w = ch + rev_w;
			} else {
				System.out.print(  rev_w + " ");
				rev_w = "";
			}
		}
		System.out.println(rev_w);
	}

}
