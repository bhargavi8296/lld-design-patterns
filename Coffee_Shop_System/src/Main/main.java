package Main;

import Machine.CoffeeMachine;
import coffe.*;
import payment.*;

public class main {
  public static void main(String args[])
  {
	  CoffeeMachine cm=CoffeeMachine.getInstance();
	  cm.startMachine();
	  
	  coffee c=new builder().setType("Espresso").setMilk().build();
	  c.show();
	  
	  payment p=new UPI();
	  PaymentService upi=new PaymentService(p);
	  upi.makePayment();
  }
}
