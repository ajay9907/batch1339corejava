package Practice_Session;

import java.util.ArrayList;

//Create an ArrayList<Integer> and add 5 integer values. Print all the elements using a for loop.

public class Array_List {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(32);
		list.add(77);
		list.add(89);
		list.add(90);

		for (Integer a : list) {
			System.out.println(a);
		}

	}

}
