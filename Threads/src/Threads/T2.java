package Threads;

public class T2 extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("2nd Loop " + i);
		}
	}
}
