package Practice_Session;
//Remove one element from ArrayList.

import java.util.ArrayList;

public class Remove_One_Element {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(33);
		list.add(33);
		list.add("xyz");
		list.add(67);
		list.add(90);
		list.add("xyz");

		System.out.println(list.contains(33));
		System.out.println(list.remove("xyz"));
		System.out.println(list.remove(1));
		System.out.println(list);
	}
}