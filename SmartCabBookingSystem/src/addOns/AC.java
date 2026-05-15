package addOns;

import types.cabTypes;

public class AC extends addOns{

	public AC(cabTypes ct) {
		super(ct);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return ct.getDesc()+"+ AC";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return ct.getCost()+200;
	}

}
