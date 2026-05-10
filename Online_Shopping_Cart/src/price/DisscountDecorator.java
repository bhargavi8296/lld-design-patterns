package price;

public abstract class DisscountDecorator implements PriceCalculator {

	protected PriceCalculator p;
	public DisscountDecorator(PriceCalculator p)
	{
		this.p=p;
	}

}
