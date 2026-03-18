package coffee;

public class ChocolateCoffee implements coffee {

	private coffee coffee;
	public ChocolateCoffee(coffee coffee)
	{
		this.coffee=coffee;
	}
	public int getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+40;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+", Chocolate";
	}

}
