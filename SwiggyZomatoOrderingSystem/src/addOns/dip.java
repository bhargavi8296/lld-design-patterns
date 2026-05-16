package addOns;

public class dip extends addOns{

	public dip(order.order o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showItem() {
		// TODO Auto-generated method stub
		order.showItem();
		System.out.println("Extra Dip");
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return order.getPrice()+50;
	}

}
