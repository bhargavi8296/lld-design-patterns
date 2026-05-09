package Main;
import Observer.*;
import Subject.*;
public class main {
	public static void main(String args[])
	{
		Subscriber s1=new User("Bhargavi");
		Subscriber s2=new User("Rahul");
		
		Channel c1=new MyChannel("BG Channel");
		c1.addSubscriber(s1);
		c1.addSubscriber(s2);
		
		c1.notifySubscribers("First Video");
		
	}
}
