package OOP_Examples;

public class Student1 extends ExamUser {

	private double marks;
	String sName;

	public Student1(String sName, double marks) {
		this.sName = sName;
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Student Name:" + sName);

	}

	public void resultCal() {
		double marks = 90;
		if (marks > 35) {
			System.out.println("Youre Marks:" + getMarks());
			System.out.println("Congratulations You're Exam Pass.");
		} else {
			System.out.println("Your Marks: " + getMarks());
			System.err.println("Fail.");
		}
	}

}
