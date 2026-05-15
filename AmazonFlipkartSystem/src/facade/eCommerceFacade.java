package facade;
import app.*;
import state.*;
import payment.*;
import product.*;
public class eCommerceFacade {
	private app a;
	private paymentStrategy ps;
	private product p;
	public eCommerceFacade(app a, paymentStrategy ps, product p)
	{
		this.a=a;
		this.ps=ps;
		this.p=p;
	}
	public void createOrder()
	{
		a.notifyCustomer(" Product: "+p.getDesc());
		double cost=p.getCost();
		System.out.println("Total Cost: "+cost);
		ps.pay(cost);
		a.nextState();
		a.nextState();
		a.nextState();
		a.nextState();
		a.nextState();
		a.notifyCustomer("Order has been Successfully Completed");
		
		
		
	}
}
