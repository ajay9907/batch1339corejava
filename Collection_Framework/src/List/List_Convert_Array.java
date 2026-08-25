package List;

import java.util.ArrayList;

//Write a Java program to convert a List into an array and print the array elements.

public class List_Convert_Array {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(54);
		l.add(44);
		l.add(24);
		l.add(14);
		l.add(64);
		l.add(74);
		l.add(94);
		l.add(04);
		l.add(84);
		l.add(74);
		l.add(64);
		l.add(771);

		System.out.println("Arry List" + l);

		Integer arr[] = l.toArray(new Integer[0]);

		System.out.println("List Converting into Array:");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
