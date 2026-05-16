package Main;
import entities.*;
import observer.*;
import app.*;
import payment.*;
import order.*;
import addOns.*;
public class main {
	public static void main(String args[])
	{
		//customer
		observer cust=new customer("Bhargavi");
		
		//Restaurants
		restaurantFactory rF=new restaurantFactory();
		groupRestaurants gR=groupRestaurants.getInstance();
		gR.addRestaurants(rF.getRestaurant("Hanwant Mahal"));
		gR.addRestaurants(rF.getRestaurant("Ginger House"));
		gR.addRestaurants(rF.getRestaurant("The Bangala"));
		
		//add items in respective restaurants
		gR.addItem("Hanwant Mahal", new Item("Pizza",500));
		gR.addItem("Hanwant Mahal", new Item("Coffee",500));
		gR.addItem("Ginger House", new Item("Dahi kabab",500));
		gR.addItem("Ginger House", new Item("Passion Fruit Mojito",500));
		gR.addItem("The Bangala", new Item("Paneer Tikka",500));
		gR.addItem("The Bangala", new Item("Peach Mojito",500));
		
		//App
		app a=new app(cust,gR.getRestaurants());
		a.showRestraunts();
		a.showMenu("Hanwant Mahal");
		
		//order
		a.addItem("Hanwant Mahal", "Pizza");
		order o=a.orderFood();
		o=new utensils(o);
		o=new priorityDelivery(o);
		o=new tissues(o);
		o=new dip(o);
		System.out.println(); 
		o.showItem();
		double cost=o.getPrice();
		System.out.println("Total cost "+cost);
		System.out.println();
		
		//payment
		payment upi=new upi();
		payment wallet=new wallet();
		upi.pay(cost);
		 
		System.out.println();
		//state transition
		a.nextState();
		a.nextState();
		a.nextState();
	}
}
