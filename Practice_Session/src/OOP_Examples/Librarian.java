package OOP_Examples;

public class Librarian extends LibraryUser {

	public Librarian(int userId, String userName, String bookId) {
		super(userId, userName);
		this.bookId = bookId;
	}

	private String bookId;

	@Override
	public void issueBook() {
		System.out.println("Book Id :" + bookId);

	}

	@Override
	public void returnBook() {
		System.out.println("Return Book Successfully.");

	}

	@Override
	public void calcFine() {
		System.out.println("No Fine ");

	}

}
