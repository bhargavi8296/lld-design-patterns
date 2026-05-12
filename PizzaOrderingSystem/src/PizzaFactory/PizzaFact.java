package PizzaFactory;

public class PizzaFact {
	 public pizza getPizza(String name)
	 {
		 if(name.equalsIgnoreCase("VEG"))
		 {
			 return new vegPizza();
		 }
		 else if(name.equalsIgnoreCase("NON VEG"))
		 {
			 return new nonVegPizza();
		 }
		 return null;
	 }
}
