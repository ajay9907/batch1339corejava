package com.tka;

public class Library {

	String lname;
	int lno;
	String ladd;
	double bookprice;
	int bookno;
	String authorname;

	public void accept(String name, int no, String add, double bprice, int bno, String aname) {
		lname = name;
		lno = no;
		ladd = add;
		bookprice = bprice;
		bookno = bno;
		authorname = aname;
	}

	public void display() {
		System.err.println("Library Details:");
		System.out.println("Liabrary name is:" + lname);
		System.out.println("Library no is:" + lno);
		System.out.println("Library Address is:" + ladd);
		System.out.println("Library Bookprice is:" + bookprice);
		System.out.println("Library book no is:" + bookno);
		System.out.println("Library authorname is:" + authorname);

	}

	

}
