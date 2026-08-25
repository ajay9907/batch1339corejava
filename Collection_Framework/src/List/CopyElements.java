package List;

import java.util.ArrayList;

//Write a Java program to copy all elements from one List to another List.

public class CopyElements {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(32);
		a.add(12);
		a.add(67);
		a.add(45);
		a.add(90);
		a.add("Ajay");
		System.out.println("Original List :" + a);

		ArrayList a1 = new ArrayList();

		for (Object b : a) {
			a1.add(b);

		}
		System.out.println("Copied All Elements From List " + a1);
	}

}
