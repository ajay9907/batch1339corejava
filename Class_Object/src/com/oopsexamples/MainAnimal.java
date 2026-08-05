package com.oopsexamples;

public class MainAnimal {
	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.breathing();
		d2.eaating();

		System.out.println("Testing Pet Branch.");

		Cat c = new Cat();
		c.breathing();
		c.eating();

		Cats cs = new Cats();
		cs.breathing();
		cs.eating();

		Dogs ds = new Dogs();
		ds.breathing();
		ds.eating();
	}

}
