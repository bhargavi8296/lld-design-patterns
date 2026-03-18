package coffee;

public class SugarCoffee implements coffee {
	private coffee coffee;
	public SugarCoffee(coffee coffee) {
		// TODO Auto-generated constructor stub
		this.coffee=coffee;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+", Sugar";
	}

}
