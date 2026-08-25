package List;

import java.util.ArrayList;

//Write a Java program to remove duplicate elements from a List.

public class Remove_Duplicate {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(20);

		for (int i = 0; i < al.size(); i++) {

			for (int j = i + 1; j < al.size(); j++) {

				if (al.get(i).equals(al.get(j))) {

					al.remove(j);
					j--;
				}

			}
		}
		System.out.println("After Removing Duplicates: " + al);

	}
}
