package addOns;

import product.product;

public class giftWrapDecorator extends productDecorator{

	public giftWrapDecorator(product p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return p.getDesc()+", Gift Wrap";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return p.getCost()+200;
	}

}
