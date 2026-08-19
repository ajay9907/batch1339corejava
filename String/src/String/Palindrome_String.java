package String;

public class Palindrome_String {
	public static void main(String[] args) {

		String name = "LeveL";
		String org = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			org = org + name.charAt(i);
		}
		if (org.equals(name)) {
			System.out.println("Is Palindrome ");
		} else {
			System.out.println("Is not Palindrome");
		}
	}

}
