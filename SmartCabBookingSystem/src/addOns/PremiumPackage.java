package addOns;

import types.cabTypes;

public class PremiumPackage extends addOns{

	PremiumPackage(cabTypes ct) {
		super(ct);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return ct.getDesc()+"+ Premium Package";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return ct.getCost()+300;
	}

}
