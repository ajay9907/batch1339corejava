package getterSetterMethod;
//Student Result

//Create a Student class.
//Fields: rollNo, marks.
//Requirements: Any class can read the marks. Only classes in the same package can update the
//marks. Hint: Which access modifier should the setter use
//Using Scanner Class.
public class Student {
	private int rollNo;
	private double marks;

//	public Student(int rollNo, double marks) {
//		this.rollNo = rollNo;
//		this.marks = marks;
//	}

	// Using getter and setter methods.
	public int getRollNo() {
		return rollNo;

	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

//using default accessSpecifier bcoz  Only classes in the same package can update the marks
	void setMarks(double marks) {
		this.marks = marks;
	}
}
