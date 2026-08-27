package Java_Fundamentals;

//Write a Java program to count the number of vowels and consonants in a given string.

public class String_Vovels_Consonants {
	public static void main(String[] args) {

		String str = "   ";
		char ch = 'a';
		int vov = 0;
		int cons = 0;
		System.out.println(str.length());// find length

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vov++;
			} else {
				cons++;
			}

		}
		System.out.println("Counting OF Vovels:" + vov);
		System.out.println("Counting Of Consonants:" + cons);
	}

}
