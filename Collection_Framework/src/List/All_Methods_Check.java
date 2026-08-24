package List;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to add, update, and remove elements from a List.

public class All_Methods_Check {
	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("Ajay");
		l.add(34);
		l.add(23.43);
		l.add(1234567890l);
		l.add(45.55f);
		l.add(true);

		System.out.println("Printing All Elements in List:" + l);

		l.addFirst(33);
		System.out.println("After Updation " + l);
		l.remove(4);
		System.out.println("Empty or not  :" + l.isEmpty());

		System.out.println("After updation :" + l);
//		l.clear();
//		System.out.println("After updation :" + l);

//		l.removeAll(l);
//		System.out.println("After updation :" + l);

		l.set(0, 45);
		System.out.println("After updation :" + l);

//		l.getFirst();
//		System.out.println("After updation :" + l);

		l.reversed();
		System.out.println("Reversed All  Elements :" + l.reversed());

	}

}
