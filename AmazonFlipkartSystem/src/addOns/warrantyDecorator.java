package addOns;

import product.product;

public class warrantyDecorator extends productDecorator{

	public warrantyDecorator(product p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return p.getDesc()+", warranty";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return p.getCost()+300;
	}

}
