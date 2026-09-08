package com.Interview_String;

public class Remove_Space {
	public static void main(String[] args) {

		String s = "Java By Kiran Academy ";
		String rsult = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch != ' ') {
				rsult += ch;
			}
		}
		System.out.println(rsult + " ");
	}

}
