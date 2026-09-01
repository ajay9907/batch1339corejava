package Threads_Methods;

public class Demo3 {
	public static void main(String[] args) {

		Thread t = new Thread(() -> {

			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
		});
		System.out.println(t.isAlive());// false

		t.start();

		System.out.println(t.isAlive());// true

		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println(t.isAlive());// false
	}

}
