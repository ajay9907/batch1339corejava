package getterSetterMethod;

//Student Marks Validation
//
//Create a class Student with:
//
//rollNo
//name
//marks
//
//Requirements:
//
//Use private variables.
//Use getters and setters.
//Take input using Scanner.
//In the setter for marks:
//If marks are between 0 and 100, store them.
//
//Otherwise, print:
//
//Invalid Marks

public class StudentMarks {
	private int rollNo;
	private String name;
	private double marks;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {

		if (marks > 0 && marks <= 100) {
			this.marks = marks;
			System.out.println(marks);
		} else {
			System.out.println("Invalid Marks.");
		}

	}
}
