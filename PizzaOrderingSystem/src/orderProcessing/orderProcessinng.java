package orderProcessing;
import PizzaFactory.*;
import java.util.*;
import Decorator.*;
import PayementStrategy.*;
public class orderProcessinng {

	public PizzaFact p;
	public orderProcessinng() {
		this.p = new PizzaFact();
	}
	public void createPizza(String name,List<String>addOns,payment ps)
	{
		pizza p1=p.getPizza(name);
		for(String str:addOns)
		{
			if(str.equalsIgnoreCase("CHEESE"))
			{
				p1=new Cheese(p1);
			}
			else if(str.equalsIgnoreCase("OLIVE"))
			{
				p1=new Olive(p1);
			}
			else if(str.equalsIgnoreCase("COKE"))
			{
				p1=new Coke(p1);
			}
			else if(str.equalsIgnoreCase("DIP"))
			{
				p1=new Dip(p1);
			}
			else {
				System.out.println(str+" is not available");
			}
		
		}
		System.out.println(p1.getDescription());
		System.out.println();
		double cost=p1.getCost();
		System.out.println("Total Cost: "+cost);
		ps.pay(cost);
		System.out.println("Order has been Successfully Placed");
		
		
	}
}
