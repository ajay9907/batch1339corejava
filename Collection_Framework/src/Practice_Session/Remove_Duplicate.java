package Practice_Session;

import java.util.ArrayList;

public class Remove_Duplicate {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Ajay");
		list.add(43);
		list.add(78);
		list.add(90);
		list.add(88);
		list.add(43);
		list.add(88);
		list.add(90);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;

				}
			}

		}
		System.out.println("Remove Duplicate value: " + list);

	}

}
