package com.onlypractice;

public class Create_Object_MainClass {
	public static void main(String[] args) {

		Create_Object c = new Create_Object();
//		c.age=32;
//		c.name="XYZ";
		System.out.println("Age:"+(c.age=32));
		System.out.println("Name:"+(c.name="Ajay"));
		c.details();
		
		//System s=new System();//The System class contains several useful class fields and methods. It cannot be instantiated. Among the facilities provided by the System class are standard input, standard output, and error output streams; access to externally defined properties and environment variables; a means of loading files and libraries; and a utility method for quickly copying a portion of an array.
//		Since:
		//s.hashCode();
		

	}

}
