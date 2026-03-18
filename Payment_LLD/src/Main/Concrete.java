package Main;

import Factory.Factory;
import paymentStrategy.payment;

public class Concrete {
	Factory paymentFactory;
	Concrete(Factory pF)
	{
		paymentFactory=pF;
	}
	public void pay()
	{
		payment mode=paymentFactory.getPayement();
		mode.pay();
	}
}
