package Practice_Session;

import java.util.ArrayList;

//Write a Java program to find the smallest element in an ArrayList without using Collections.min().

public class Find_Small {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(754);
		l.add(321);
		l.add(453);
		l.add(567);
		l.add(678);
		l.add(8);
		l.add(-6);

//		System.out.println(l);

		int min = l.get(0);

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) < min) {
				min = l.get(i);
			}
		}
		System.out.println("Minimum Elements: " + min);

	}

}
