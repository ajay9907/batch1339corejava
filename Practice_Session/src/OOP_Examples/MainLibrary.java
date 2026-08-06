package OOP_Examples;

public class MainLibrary {
	public static void main(String[] args) {

		System.err.println("Student ");

		LibraryUser lu = new Student(5, "Ajay", 56, "Jay Hind");
		lu.display();
		System.out.println("---------");
		lu.issueBook();

		lu.returnBook();
		System.out.println("---------");

		lu.calcFine();

		System.err.println("------------");
		System.err.println("Liabrarian");

		lu = new Librarian(32, "xyz", "LB4567");
		lu.display();
		System.out.println("---------");
		lu.issueBook();
		lu.returnBook();
		lu.calcFine();

	}
}
