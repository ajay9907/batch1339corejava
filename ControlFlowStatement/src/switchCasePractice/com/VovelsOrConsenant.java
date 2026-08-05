package switchCasePractice.com;

//Write a Java program using switch to check whether a character is a vowel (a, e, i, o, u) or a consonant. Don't use if-else; use only switch.
public class VovelsOrConsenant {
	public static void main(String[] args) {

		char ch = 'Y';
		switch (ch) {
		case 'A':
		case 'a':
			System.out.println("a is a Vowel: " + ch);
			break;
		case 'E':
		case 'e':
			System.out.println("e is a Vowel: " + ch);
			break;
		case 'I':
		case 'i':
			System.out.println("i is a Vowel: " + ch);
			break;
		case 'O':
		case 'o':
			System.out.println("o is a vowel: " + ch);
			break;
		case 'U':
		case 'u':
			System.out.println("u is a Vowel: " + ch);
			break;
		default:
			System.out.println(ch + " is a " + "consonant. " );
		}
	}
}
