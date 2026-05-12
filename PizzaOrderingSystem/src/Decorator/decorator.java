package Decorator;

import PizzaFactory.pizza;

public abstract class decorator implements pizza{
	pizza p;
	decorator(pizza p)
	{
		this.p=p;
	}
}
