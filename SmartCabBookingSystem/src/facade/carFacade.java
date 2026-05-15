package facade;
import payment.*;
import app.*;
import types.*;
public class carFacade {
	private paymentStrategy ps;
	private cabTypes ct;
	private app a;
	public carFacade(paymentStrategy ps,cabTypes ct,app a)
	{
		this.ps=ps;
		this.ct=ct;
		this.a=a;
	}
	public void prepareRide()
	{
		a.notifyCustomer(ct.getDesc());
		a.nextState();
		a.nextState();
		a.nextState();
		a.nextState();
		double totalAmount=ct.getCost();
		System.out.println("Total cost: "+totalAmount);
		ps.pay(totalAmount);
		
	}
}
