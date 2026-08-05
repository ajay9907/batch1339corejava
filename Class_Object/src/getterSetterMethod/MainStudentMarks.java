package getterSetterMethod;

import java.util.Scanner;

public class MainStudentMarks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll No :");
		int rno = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Student Name :");
		String sname = sc.nextLine();

		System.out.println("Enter Your Marks: ");
		double mark = sc.nextDouble();
		 

		// making object creation.

		StudentMarks sm = new StudentMarks();

		// using setter method for storing value in variable purpose

		sm.setRollNo(rno);
		sm.setName(sname);
		sm.setMarks(mark);

		// using getter method for displaying value
		System.err.println("-------------");
		System.out.println("Student Roll No  is :" + sm.getRollNo());
		System.out.println("Student Name is :" + sm.getName());
		System.out.println("Student Marks are :" + sm.getMarks());
	}
}
