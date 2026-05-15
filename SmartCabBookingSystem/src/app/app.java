package app;
import java.util.*;
import observer.*;
import state.*;
public class app {
	observer customer;
	state s;
	public app(observer o)
	{
		customer=o;
		s=new IdleState();
	}
	public void stateStatus()
	{
		s.getStatus();
	}
	public void setState(state temp)
	{
		s=temp;
	}
	public void nextState()
	{
		s.handle(this);
	}
	public void notifyCustomer(String msg)
	{
		customer.update(msg);
	}
}
