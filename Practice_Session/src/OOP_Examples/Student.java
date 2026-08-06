package OOP_Examples;

public class Student extends LibraryUser {

	private int bookId;
	private String bookName;

	Student(int userId, String userName, int bookId, String bookName) {
		super(userId, userName);
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public void issueBook() {
		System.out.println("Book Id: " + bookId);
		System.out.println("BookName:" + bookName);

	}

	@Override

	public void calcFine() {

		int lateDays = 4;
		int finePerDay = 5;

		if (lateDays > 0) {
			double totalFine = lateDays * finePerDay;
			System.out.println("Late Days : " + lateDays);
			System.out.println("Fine Amount :" + totalFine);
		} else {
			System.out.println("No Fine.");
		}
	}

	@Override
	public void returnBook() {
		System.out.println("Please return book on time.");

	}

}
