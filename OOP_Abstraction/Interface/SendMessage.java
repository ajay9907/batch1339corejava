package Interface;
//Notification System

//Create interface Notification:
//sendMessage(String msg)
//Implement:
//EmailNotification
//SMSNotification
//WhatsAppNotification

public interface SendMessage {

	public void emailNotification(String msg);

	public void smsNotification(String msg);

	public void whatsAppNotification(String msg);
}
