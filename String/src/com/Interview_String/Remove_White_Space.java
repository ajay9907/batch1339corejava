package com.Interview_String;

public class Remove_White_Space {
	public static void main(String[] args) {

		String name = "Ajay Agwan   ";
		String remove = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch != ' ') {
				remove = remove + ch;
			}
		}
		System.out.println("Original String: " + name);
		System.out.println("After Removing String :" + remove);
	}
}
