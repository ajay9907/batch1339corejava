package com.saturdaypractice;

//20. Library System
//Create Library:
//Constructor â†’ bookName, isIssued (boolean)
//Methods:
//issueBook()
//returnBook()
//Prevent issuing if already issued

public class Library {
	String bName;
	boolean isIssued;

	public Library(String n, boolean iss) {
		this.bName = n;
		this.isIssued = iss;

	}

	public void issueBook() {
		if (isIssued == false) {

			isIssued = true;
			System.out.println("Book Issued  Successfully. ");
		} else {
			System.out.println("Book is already Issued.");

		}

	}

	public void returnBook() {
		if (isIssued == true) {
			isIssued = false;
			System.out.println("Book Return Successfully .");

		} else {
			System.out.println("Book is not issued  ");
		}
	}
}
