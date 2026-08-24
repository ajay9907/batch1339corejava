package List;
//Write a Java program to find the size of a List and print the first and last element.

import java.util.ArrayList;

public class Find_SizeOf_List {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("Ajay");
		al.add(45);
		System.out.println("Size of List :" + al.size());

		System.out.println("First Elements :" + al.getFirst());
		System.out.println("Last Elements: " + al.getLast());

	}

}
