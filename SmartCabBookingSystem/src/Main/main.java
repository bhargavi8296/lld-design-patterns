package Main;
import observer.*;
import payment.*;
import app.*;
import types.*;
import addOns.*;
import facade.*;
public class main {
	public static void main(String args[])
	{
		observer cust1=new customer("Bhargavi");
		
		//Payment->Strategy
		paymentStrategy upi=new upi();
		paymentStrategy wallet=new wallet();
		paymentStrategy card=new card();
		
		//App 
		app a=new app(cust1);
		
		//Factory
		cabTypeFactory ct=new cabTypeFactory();
		cabTypes mini=ct.getFactory("Mini");
		mini=new AC(mini);
		mini=new LuxuryPackage(mini);
		
		//Facade
		carFacade f1=new carFacade(upi,mini,a);
		f1.prepareRide();
		
		
	}
}
