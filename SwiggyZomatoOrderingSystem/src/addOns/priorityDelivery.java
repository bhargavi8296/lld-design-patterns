package addOns;
import order.*;
public class priorityDelivery extends addOns{

	public priorityDelivery(order o) {
		super(o);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showItem() {
		// TODO Auto-generated method stub
		order.showItem();
		System.out.println("Priority Delivery");
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return order.getPrice()+50;
	}

}
