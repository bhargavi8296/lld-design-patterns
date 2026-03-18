package coffee;

public class MilkCoffee implements coffee{

	private coffee coffee;
	public MilkCoffee(coffee c)
	{
		this.coffee=c;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+", Milk";
	}

	public int getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+20;
	}

}
