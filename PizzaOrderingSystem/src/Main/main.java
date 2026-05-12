package Main;
import java.util.*;
import orderProcessing.*;
import PayementStrategy.*;
import PizzaFactory.PizzaFact;
public class main {
	public static void main(String args[])
	{
		orderProcessinng op=new orderProcessinng();
		List<String>addOns=new ArrayList<>();
		addOns.add("cheese");
		addOns.add("olive");
		addOns.add("coke");
		payment upi=new upi();
		payment wallet=new wallet();
		op.createPizza("veg", addOns, wallet);
		System.out.println();
		addOns.add("Capsicum");
		op.createPizza("non veg", addOns, wallet);
		
	}
}
