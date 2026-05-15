package addOns;

import types.cabTypes;

public class LuxuryPackage extends addOns{

	public LuxuryPackage(cabTypes ct) {
		super(ct);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return ct.getDesc()+"+ Luury Package";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return ct.getCost()+200;
	}

}
