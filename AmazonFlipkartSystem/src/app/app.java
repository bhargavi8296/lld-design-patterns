package app;
import observer.*;
import state.*;
public class app {
	observer customer;
	state s;
	public app(observer o)
	{
		customer=o;
		s=new ordered();
	}
	public void setState(state temp) {
		s=temp;
	}
	public void nextState() {
		s.handle(this);
	}
	public void getStatus() {
	
	}
	public void notifyCustomer(String msg)
	{
		customer.update(msg);
	}
	
}
