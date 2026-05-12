package PizzaFactory;

public class vegPizza implements pizza{
	
	public double getCost()
	{
		return 200;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Veg Pizza";
	}
}
