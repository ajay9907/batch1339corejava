package Array_List;

import java.util.ArrayList;
import java.util.List;

//Create an ArrayList<Integer>, add 5 integer values, and print all elements using an Iterator.

public class Basic {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		System.out.println(list);
	}

}
