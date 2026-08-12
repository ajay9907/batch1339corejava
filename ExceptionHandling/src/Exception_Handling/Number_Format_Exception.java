package Exception_Handling;

public class Number_Format_Exception {
	public static void main(String[] args) {
		String num = "abc";
		try {
			Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.out.println("Invalid number Format.");
		}
	}
}
