package com.String_Test;

// It is include String , String Bufffer and Builder 

public class String_Test {
	public static void main(String[] args) {

//		String s1 = "Ajay";
//		String s2 = new String("Ajay");

//		System.out.println(s1.charAt(3));// find index of particular elements

//		System.out.println(s1.codePointAt(0));//unicode ascii value

//		System.out.println(s1.codePointBefore(1));// Returns the character (Unicode code point) before the specified
		// index. The index refers to char values (Unicode code units) and
		// ranges from 1 to length.

//		System.out.println(s1.codePointCount(5, 11));// Returns the number of Unicode code points in the specified text
		// range of this String. The text range begins at the specified
		// beginIndex and extends to the char at index endIndex - 1.

		String s3 = "jay-Hind";
		String s4 = new String("Limbaganesh" + " ");

//		int result = s3.compareTo(s4);// Compares two strings lexicographically. The comparison is based
//		System.out.println(result); 

		// on the
		// Unicode value of each character in the strings. The character
		// sequence represented by this String object is compared
		// lexicographically to the character sequence represented by the
		// argument string.

//		System.out.println(s3.compareToIgnoreCase(s4));// It is same as compareTo but it is not case Sensitive

//		System.out.println(s4.concat("Beed"));// Concatenates the specified string to the end of this string.

//		System.out.println(s3.contains("3"));// Returns true if and only if this string contains the specified sequence
		// of char values.

//		System.out.println(s3.contentEquals(s4));// Compares this string to the specified CharSequence. The result is
		// true if and only if this String represents the same sequence of
		// char values as the specified sequence.

//		System.out.println(s3.endsWith("1"));// Tests if this string ends with the specified suffix.

//		System.out.println(s3.equals(s4));// The result is true if and only if the argument is not null and is a String
		// object that represents the same sequence of characters as this object.

		String s5 = new String("  ");

//		System.out.println(s3.equalsIgnoreCase(s5));// Compares this String to another String, ignoring case
		// considerations. Two strings are considered equal ignoring case if
		// they are of the same length and corresponding Unicode code points
		// in the two strings are equal ignoring case.

//		System.out.println(s5.formatted());// Formats using this string as the format string, and the supplied
//											// arguments.
//
//		System.out.println(s3.hashCode());// Returns a hash code for this string. The hash code for a String object is
//											// computed as
//		System.out.println(s5.hashCode());

		// System.out.println(s5.indent(3));// Adjusts the indentation of each line of
		// this string based on the value of n,
		// and normalizes line termination characters.
//		System.out.println(s5.indexOf("Y"));// is true. In either case, if no such character occurs in this string, then
		// -1 is returned.
//		System.out.println(s5.indexOf("XYZ"));

//		System.out.println(s5.indexOf("X", 1));

//		String name = "Ganpati";
//		String name1 = new String("Ganpati");
////
//		String name2 = name1.intern();
//		System.out.println(name == name2);
//
		// System.out.println(s3.isEmpty());//It is find string empty or not

//		System.out.println(s3.matches(s5));//

//		System.out.println(s3.lastIndexOf("jF"));

//		System.out.println(s3.repeat(7));

//		System.out.println(s3.replace("j", "A"));

//		System.out.println(s3.strip());// removed white space

//		System.out.println(s3.stripIndent());

//		System.out.println(s3.substring(4));// Returns a string that is a substring of this string. The substring begins
		// with the character at the specified index and extends to the end of this
		// string.

//		System.out.println(s3.trim());// same as work of strip method

//		char ch[] = s3.toCharArray();
//		System.out.println(ch);

//		char arr[] = { 'A', 'J', 'A', 'Y' };
//		System.out.println(arr);

//		System.out.println(s3.toString());//it is return object itself

//		String s = "Java,is-Easy ";
//		String arr[] = s.split(",");// This method works as if by invoking the two-argument split method with the
									// given expression and a limit argument of zero. Trailing empty strings are
									// therefore not included in the resulting array.
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		String a = "ABC";
		byte[] b = a.getBytes();
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	}

}
