package Threads;

public class ThreadMethods extends Thread {

//	@Override
	public void run() {
		int num = 100;
		for (int i = 1; i <= num; i++) {
			System.out.println("myThread " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println();
			}

		}
	}

	public void m1() {
		for (int i = 111; i <= 250; i++) {
			System.out.println("myThread " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println();
			}
		}
	}
}