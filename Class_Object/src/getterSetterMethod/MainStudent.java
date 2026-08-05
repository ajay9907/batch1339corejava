package getterSetterMethod;

import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll No :");
		int rollNo = sc.nextInt();

		System.out.println("Enter Your Marks:");
		double marks = sc.nextDouble();

		Student s = new Student();

		s.setRollNo(rollNo);
		s.setMarks(marks);
		System.err.println("----------");
		System.out.println("Student Roll No is: " + s.getRollNo());
		System.out.println("Student Marks :" + s.getMarks());
		sc.close();
	}

}
