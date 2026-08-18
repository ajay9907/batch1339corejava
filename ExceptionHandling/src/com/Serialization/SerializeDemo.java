
package com.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {

		Student s = new Student(101, "Mahadev", 85.5);

		try {

			FileOutputStream fos = new FileOutputStream("student.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(s);

			oos.close();
			fos.close();

			System.out.println("Serialization Successful");

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}