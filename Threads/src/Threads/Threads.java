package Threads;

public class Threads extends Thread {
	@Override
	public void run() {

		System.out.println("This is Thread.");
	}

	public static void main(String[] args) {

		Threads t = new Threads();
		t.start();
	}
}
