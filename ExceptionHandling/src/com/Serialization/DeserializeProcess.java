package com.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeProcess {

	public static void main(String[] args) {

		try {

			FileInputStream fi = new FileInputStream("student.txt");

			ObjectInputStream o = new ObjectInputStream(fi);

			Student s = (Student) o.readObject();

			s.display();

			o.close();
			fi.close();

		} catch (Exception e) {

			System.out.println();

		}
	}
}
