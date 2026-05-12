package addOnsBehaviour;

import Ticket.ticket;

public class popcorn extends addOns{

	public popcorn(ticket t)
	{
		super(t);
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return t.getDescription()+"+ popcorn";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return t.getCost()+300;
	}

}
