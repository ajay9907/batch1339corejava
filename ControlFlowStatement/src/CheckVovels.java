//Write a program to check whether a character is vowel or consonant.

public class CheckVovels {

	public static void main(String[] args) {
		char ch = 'j';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println( "is a Vovel: "+ ""+ ch);
		} else if ((ch >= 'a' || ch >= 'h') && (ch >= 'r' || ch <= 't')) {
			System.out.println("is a contants");
		} else {
			System.out.println("Invalid ...!");
		}
	}
}