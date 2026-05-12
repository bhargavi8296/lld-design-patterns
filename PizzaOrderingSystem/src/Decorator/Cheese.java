package Decorator;
import PizzaFactory.*;
public class Cheese extends decorator {

	public Cheese(pizza p)
	{
		super(p);
	}
	@Override
	public double getCost() {
		
		// TODO Auto-generated method stub
		return 10+p.getCost();
		

	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return p.getDescription()+"+"+"Extra Chesse";

	}

}
