package price;

public class StudentDisscount extends DisscountDecorator{

	public StudentDisscount(PriceCalculator p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return p.getPrice()-1000;
	}

}
