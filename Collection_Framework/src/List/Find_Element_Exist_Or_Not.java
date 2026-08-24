package List;

import java.util.ArrayList;

//Write a Java program to check whether a given element exists in a List or not.

public class Find_Element_Exist_Or_Not {
	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
		l.add("54,76");
		l.add("Ajay");
		l.add(0, "My Name ");

		System.out.println("All Elements " + l);
		System.out.println("Exist or Not :" + l.contains("Ajay"));
		// or
//		if (l.contains("Ajay")) {
//			System.out.println("Is Found ");
//		} else {
//			System.out.println("Not Found");
//		}

	}
}
