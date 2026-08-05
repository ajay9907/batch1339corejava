//Write a program to check if a person is eligible for voting (age ≥ 18).

public class AsciiValue {
	public static void main(String[] args) {
//		for (int i = 65; i <= 128; i++) {
//			System.out.println((char)i);
//		}

		
		//It is find are the ascii values based on range 
		
		char ascii = 'A';
		if (ascii >= 48 && ascii <= 57) {
			System.out.println("Digit-->" +(int)ascii);
		} else if (ascii >= 65 && ascii <= 90) {
			System.out.println("CapsLock-->" +(int) ascii);

		} else if (ascii >= 97 && ascii <= 127) {
			System.out.println("Lower Case-->" +(int)+ ascii);
		} else {
			System.out.println("Special Symbols-->" + ascii);

		}

	}
}
