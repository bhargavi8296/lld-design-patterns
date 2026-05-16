package addOns;

public class tissues extends addOns{

	public tissues(order.order o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showItem() {
		// TODO Auto-generated method stub
		order.showItem();
		System.out.print("Tissues");
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return order.getPrice()+50;
	}

}
