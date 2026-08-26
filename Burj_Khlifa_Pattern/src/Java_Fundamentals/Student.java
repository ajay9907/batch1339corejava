package Java_Fundamentals;
//Write a Java program to store the following information using appropriate data types:

//Student name
//Student age
//Student percentage
//Student grade
//Whether the student is passed or not

public class Student {
	public static void main(String[] args) {
		String name = "Ajay";
		int age = 24;
		double per = 45.55;
		char grade = 'A';
		boolean pass = true;

		System.out.println("Student Information");
		System.out.println("Name :" + name);
		System.out.println("Age : " + age);
		System.out.println("percentage :" + per);
		System.out.println("Grade :" + grade);
		System.out.println("Pass Or Fail :" + pass);

	}
}
