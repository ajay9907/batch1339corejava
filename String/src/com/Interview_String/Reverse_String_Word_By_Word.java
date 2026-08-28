package com.Interview_String;

import java.util.Scanner;

public class Reverse_String_Word_By_Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String s = sc.nextLine();

		Reverse_String_Word_By_Word obj = new Reverse_String_Word_By_Word();

		String result = obj.ReverseOrder(s);

		System.out.println("Reversed words: " + result);

		sc.close();
	}

	public String ReverseOrder(String s) {

		StringBuilder ans = new StringBuilder();

		int i = s.length() - 1;
		while (i >= 0) {
			// remove all trailing spaces
			while (i >= 0 && s.charAt(i) == ' ') {
				i--;
			}
			// check value of i
			if (i < 0) {
				break;
			}
			int j = i;
			// find the start index of the word

			while (j >= 0 && s.charAt(j) != ' ') {
				j--;

			}

			// just reached on j index then stop here ,
			// now this words append in ans

			ans.append(s.substring(j + 1, i + 1));

			// remove dummy spaces and where j is standing and add a space in ans

			while (j >= 0 && s.charAt(j) == ' ') {
				j--;
			}
			// j<0 means no needed spaces on first index
			// j>=0, it is needed space

			if (j >= 0) {
				ans.append(' ');
			}
			i = j;

		}
		return ans.toString();
	}

}
