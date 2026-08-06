package OOP_Examples;

public class MainExam {
	public static void main(String[] args) {
		System.err.println("---Student 1----");
		ExamUser eu;
		eu = new Student1("Ajay", 89.08);
		eu.display();
		eu.resultCal();
		System.err.println("---Admin1---");
		eu = new Admin1(44, "Abhay");
		eu.display();
		eu.resultCal();

	}

}
