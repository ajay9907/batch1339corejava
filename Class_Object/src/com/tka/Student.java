package com.tka;

import java.util.Scanner;

public class Student {

	int s_Rollno = 3;
	String s_Name = "Xyz";
	long s_phNo = 345678974l;
	String s_Course = "BCA";
	String s_email = "xyz@mail.com";
	long s_Adharno = 3245678965432l;
	String s_address = "Pune";
	String s_Clg = "zxy";
	float s_marks = 8.58f;

//	public void accept(int rno, String name, long phno, String course, String email, long adharno, String add,
//			String clg, float  marks) {
//		s_Rollno = rno;
//		s_Name = name;
//		s_phNo = phno;
//		s_Course = course;
//		s_email = email;
//		s_Adharno = adharno;
//		s_address = add;
//		s_Clg = clg;
//		s_marks = marks;
//	}

	public void showdetails() {
		System.err.println("Student All Information :");
		System.out.println("Student Rollno:" + s_Rollno);
		System.out.println("Student name:" + s_Name);
		System.out.println("Student phone no:" + s_phNo);
		System.out.println("Student email:" + s_email);
		System.out.println("Student Adharno:" + s_Adharno);
		System.out.println("Student Address:" + s_address);
		System.out.println("Student Collage name:" + s_Clg);
		System.out.println("Student Marks:" + s_marks);

	}

	

}
