package Exception_Handling;

public class Null_Exception {
	public static void main(String[] args) {
		String name = null;

		try {
			name.length();
			System.out.println("Not printed null");
		} catch (NullPointerException e) {
			System.out.println("It is a nullPointer Exception.");
		} finally {
			System.out.println("It is finally block");
		}
	}

}
