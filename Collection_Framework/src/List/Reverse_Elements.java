package List;
//Write a Java program to reverse elements of a List.

import java.util.ArrayList;

public class Reverse_Elements {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(56);
		a.add(33);
		a.add(22);
		a.add(78);
		a.add(98);

		System.out.println("Reverse List :" + a.reversed());

	}

}
