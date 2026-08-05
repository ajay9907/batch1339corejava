package Interface;

public class Application implements SendMessage {
	@Override
	public void emailNotification(String msg) {
		System.out.println("Recived Notification on Email :" + msg);

	}

	@Override
	public void smsNotification(String msg) {
		System.out.println("Recived Notification on Message :" + msg);

	}

	@Override
	public void whatsAppNotification(String msg) {
		System.out.println("Recived Notification on WhatsApp :" + msg);

	}

}
