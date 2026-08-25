package List;

import java.util.ArrayList;
import java.util.Comparator;

//Write a Java program to sort a List of integers in ascending order.

public class Sort_Ascending {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(54);
		a.add(543);
		a.add(5);
		a.add(532);
		a.add(54334);
		a.add(-5);
		for (Integer s : a) {
			System.out.println(s + " ");
		}
		a.sort(null);
		System.out.println("Sorting of Ascending Order:" + a);

	}

}
