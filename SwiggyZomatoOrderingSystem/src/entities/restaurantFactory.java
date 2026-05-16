package entities;

public class restaurantFactory {

	public restaurant getRestaurant(String name)
	{
		return new restaurant(name);
	}
}
