package getterSetterMethod;

public class MainLibrary {
	public static void main(String[] args) {
		Book b = new Book();
		b.setAuthor("Ajaya");

		System.out.println("Author name is :" + b.getAuthor());
		System.out.println("Book Title is :" + b.getTitle());

	}

}
