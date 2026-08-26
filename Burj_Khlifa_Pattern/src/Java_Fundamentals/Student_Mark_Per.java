package Java_Fundamentals;

import java.util.Scanner;

//Write a Java program to calculate a student's total marks and percentage.

public class Student_Mark_Per {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Subject ");
		String sub = sc.nextLine();
		System.out.println("Enter Math Marks :");
		int math = sc.nextInt();
		System.out.println("Enter Science Marks :");
		int science = sc.nextInt();
		System.out.println("Enter English Marks:");
		int english = sc.nextInt();
		System.out.println("Enter your Subject Marks:");

		System.out.println("Your Subject :" + sub);

		int total = math + science + english;

		System.out.println("Total Marks: " + total);
		double percent = total / 300.00 * 100;
		System.out.println("Percentage :" + percent);
	}

}
