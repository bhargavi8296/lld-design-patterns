package Decorator;

public class SMSNotificationDecorator extends NotificationDecorator{

	public SMSNotificationDecorator(Notification.notification n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	public void send()
	{
		notification.send();
		System.out.println("Notification send via SMS");
	}

}
