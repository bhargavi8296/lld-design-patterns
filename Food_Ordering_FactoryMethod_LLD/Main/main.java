package Main;

import FactoryMethod.FactoryMethod;
import food.*;
import order.*;

public class main {
	public static void main(String args[])
	{
		foodFactory pizza=new pizzaFactory();
		foodFactory burger=new burgerFactory();
		FactoryMethod fm=new FactoryMethod();
		food f1=fm.getOrder(pizza);
		f1.prepare();f1.cook();f1.pack();
		food f2=fm.getOrder(burger);
		f2.prepare();f2.cook();f2.pack();
	}
}
