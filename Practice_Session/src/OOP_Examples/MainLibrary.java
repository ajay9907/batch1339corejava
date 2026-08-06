package OOP_Examples;

public class MainLibrary {
	public static void main(String[] args) {
		LibraryUser lu = new Student(5, "Ajay", 56, "Jay Hind");
		lu.issueBook();
		lu.returnBook();
		lu.calcFine();
		lu.display();

		System.err.println("------------");
		lu = new Librarian(32, "xyz", "LB4567");
		lu.issueBook();
		lu.returnBook();
		lu.calcFine();
		lu.display();

	}
}
