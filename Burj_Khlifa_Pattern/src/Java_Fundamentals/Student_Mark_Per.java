package Java_Fundamentals;

//Write a Java program to calculate a student's total marks and percentage.

public class Student_Mark_Per {
	public static void main(String[] args) {

		int math = 78;
		int science = 85;
		int english = 72;

		int marks = 90;

		if (marks >= 90 && marks >= 80) {
			System.out.println("Grade A : " + marks);
		} else if (marks >= 70 && marks >= 60) {
			System.out.println("Grade B :" + marks);
		} else if (marks >= 45 && marks >= 35) {
			System.out.println("Grade c :" + marks);
		} else {
			System.out.println("Fail...!");

		}
		int total = math + science + english;
		System.out.println("Total Marks: " + total);
		double percent = total * 3 / 100;
		System.out.println("Percentage :" + percent);
	}

}
