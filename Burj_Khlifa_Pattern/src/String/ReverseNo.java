package String;

//Write a Java program to reverse a String without using built-in reverse methods.

public class ReverseNo {

	public static void main(String[] args) {

		String str = "Java Is an Language";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reverse String :" + rev);

	}
}
