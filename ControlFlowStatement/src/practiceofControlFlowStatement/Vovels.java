package practiceofControlFlowStatement;

//Check whether a character is a vowel or consonant.

public class Vovels {
	public static void main(String[] args) {
		char ch = 'z';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(" Character is a Vovels: " + ch);

		} else {
			System.out.println("Character is Constants: " + ch);
		}
	}

}
