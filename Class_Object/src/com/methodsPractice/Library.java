package com.methodsPractice;
//Library System

//Method issueBook(String bookName, boolean isAvailable).

public class Library {

	public void issueBook(String bookame, boolean isAvailable) {
		if (isAvailable) {
			System.out.println("Book is Available :" + isAvailable);
		} else {
			System.out.println("Book is not available: " + isAvailable);

		}
	}

}
