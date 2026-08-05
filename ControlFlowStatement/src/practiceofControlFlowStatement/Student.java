package practiceofControlFlowStatement;
//Check whether a student has passed or failed (passing marks = 35).

public class Student {
	public static void main(String[] args) {
		double marks = 35;
		if (marks >= 35) {
			System.out.println("Congratulations You're Passed : " + marks);
		} else {
			System.out.println("!...Fail...!");
		}
	}

}
