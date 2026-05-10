package Main;
import Notification.*;
import Decorator.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notification n=new SMSNotificationDecorator(
                new EmailNotificationDecorator(
                        new BasicNotification()
                )
        );
		System.out.println("Notification 1");
		n.send();
		notification n1=new SMSNotificationDecorator(
                        new BasicNotification()
                
        );
		System.out.println();
		System.out.println("Notification 2");
		n1.send();
		

	}

}
