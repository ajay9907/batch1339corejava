package Threads;

public class Main {
	public static void main(String[] args) {
		ThreadMethods tm = new ThreadMethods();
		T2 t = new T2();
		tm.start();
		tm.m1();
		// t.start();

	}
}
