package price;

public class FestivalDisscount extends DisscountDecorator{

	public FestivalDisscount(PriceCalculator p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice()-500;
	}

}
