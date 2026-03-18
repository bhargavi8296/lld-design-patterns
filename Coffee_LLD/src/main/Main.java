package main;
import factory.*;
import coffee.*;
public class Main {
	public static void main(String args[]) throws Exception
	{
		coffee coffee=factory.createCoffee("BASIC");
		coffee=new MilkCoffee(coffee);
		coffee=new SugarCoffee(coffee);
		coffee=new ChocolateCoffee(coffee);
		System.out.println(("Coffee Type is: "+coffee.getDescription()));
		System.out.println("Cost is: "+coffee.getCost());
		
		
	}
}
