package Decorator;
import Notification.*;
public abstract class NotificationDecorator implements notification{

	protected notification notification;
	NotificationDecorator(notification n)
	{
		this.notification=n;
	}
}
