package FactoryMethod;

import food.food;
import order.*;

public class FactoryMethod {
	public food getOrder(foodFactory o)
	{
		return o.getFood();
	}

}
