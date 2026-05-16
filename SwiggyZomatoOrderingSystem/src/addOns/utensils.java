package addOns;

public class utensils extends addOns{

	public utensils(order.order o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showItem() {
		// TODO Auto-generated method stub
		order.showItem();
		System.out.println("Extra Utensils");
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return order.getPrice()+50;
	}

}
