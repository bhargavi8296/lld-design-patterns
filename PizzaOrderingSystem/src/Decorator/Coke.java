package Decorator;
import PizzaFactory.*;
public class Coke extends decorator {

	public Coke(pizza p)
	{
		super(p);
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 30+p.getCost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return p.getDescription()+"+"+"Coke";
	}

}
