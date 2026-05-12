package order;
import java.util.*;
import PayementStrategy.*;
import Ticket.*;
import addOnsBehaviour.*;
public class orderProcessing {
	ticketFact tf;
	public orderProcessing()
	{
		tf=new ticketFact();
	}
	public void createOrder(String name,List<String>addOns,payment pay)
	{
		ticket t=tf.getTicket(name);
		for(String str:addOns)
		{
			if(str.equalsIgnoreCase("POPCORN")) {
				t=new popcorn(t);
			}
			else if(str.equalsIgnoreCase("COKE"))
			{
				t=new coke(t);
			}
			else {
				System.out.println(str+" is not available");
			}
		}
		String tname=t.getDescription();
		System.out.println("Order :"+tname);
		double cost=t.getCost();
		System.out.println("Total Cost :"+cost);
		pay.pay(cost);
		System.out.println("Your order has been placed Successfully");
		System.out.println();
	}
}
