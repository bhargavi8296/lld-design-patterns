package Decorator;
import PizzaFactory.*;
public class Dip extends decorator {
	
	public Dip(pizza p)
	{
		super(p);
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return p.getCost()+30;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return p.getDescription()+"+ Dip";
	}

}
