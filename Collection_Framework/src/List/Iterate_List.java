package List;

import java.util.ArrayList;

public class Iterate_List {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(55);
		a.add(1, 11);
		a.add(45);
		a.add(21);
		a.add(78);

		System.out.println("List Iteration: ");

		for (Integer b : a) {
			System.out.println(b);
		}

	}
}
