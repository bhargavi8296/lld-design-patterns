package addOnsBehaviour;

import Ticket.ticket;

public class coke extends addOns{

	public coke(ticket t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return t.getDescription()+"+ Coke";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return t.getCost()+150;
	}

}
