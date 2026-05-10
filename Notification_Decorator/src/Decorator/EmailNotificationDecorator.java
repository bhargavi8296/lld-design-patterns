package Decorator;

public class EmailNotificationDecorator extends NotificationDecorator{

	public EmailNotificationDecorator(Notification.notification n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	public void send()
	{
		notification.send();
		System.out.println("Notification send via EMAIL");
	}

}
