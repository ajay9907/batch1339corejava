package Threads_Methods;

public class Daemon_Threads {
	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			while (true) {
				System.out.println("Running ");
			}
		});

		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
	}

}
