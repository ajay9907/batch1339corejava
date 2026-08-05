package scenerioPracticeQuestions;

//• 1. Student Admission – Age >=18 and Marks >=60 -> Eligible.

public class Admission {
	public static void main(String[] args) {

		int age = 23;
		double marks = 66;
		if (age >= 18) {
			if (marks >= 60) {
				System.out.println("You're Eligible for Admission.");
			} else {
				System.out.println("You're not Eligible for Admission.");
			}
		}
	}
}
