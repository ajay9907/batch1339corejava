package com.SuperKeyword;

import javax.sound.midi.SysexMessage;

public class MainClass {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.show();

		System.err.println("!!!!!!!!!");

		Dog d = new Dog();
		d.show();

		System.err.println("!!!!!!!!!");

		Car c = new Car("Toyota", "Fortuner", 200);
		c.display();

	}
}