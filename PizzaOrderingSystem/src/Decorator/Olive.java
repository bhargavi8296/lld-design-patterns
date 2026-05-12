package Decorator;

import PayementStrategy.payment;
import PizzaFactory.pizza;

public class Olive extends decorator{

	public Olive(pizza p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return p.getCost()+30;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return p.getDescription()+"+ Olive";
	}

	

}
