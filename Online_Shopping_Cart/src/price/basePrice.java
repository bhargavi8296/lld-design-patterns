package price;

public class basePrice implements PriceCalculator {

	double price;
	public basePrice(double price)
	{
		this.price=price;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
