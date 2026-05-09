package Subject;

import Observer.*;
import java.util.*;

public class MyChannel implements Channel {
	List<Subscriber>subscribers=new ArrayList<>();
	String name;
	public MyChannel(String name) {this.name=name;}
	@Override
	public void addSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscribers.add(s);

	}

	@Override
	public void removeSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscribers.remove(s);

	}

	@Override
	public void notifySubscribers(String msg) {
		// TODO Auto-generated method stub
		for(Subscriber s:subscribers)
		{
			s.update(msg,name);
		}

	}

}
