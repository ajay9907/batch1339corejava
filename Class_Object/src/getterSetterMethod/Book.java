package getterSetterMethod;

//Question 5 – Library Book
//Create a Book class.
//Fields: title, author.
//Requirements: Only classes in the same package can update the title. Every class can read the
//title.
public class Book {
	// using private variables bcoz we're cannot directly access them.
	private String title = "JayHind";
	private String author;

	public String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
