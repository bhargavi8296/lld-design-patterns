package Ticket;

public class ticketFact {
	public ticket getTicket(String name)
	{
		if(name.equalsIgnoreCase("REGULAR"))
		{
			return new regular();
		}
		else if(name.equalsIgnoreCase("PREMIUM"))
		{
			return new premium();
		}
		else if(name.equalsIgnoreCase("RECLINER"))
		{
			return new recliner();
		}
		else if(name.equalsIgnoreCase("VIP"))
		{
			return new vip();
		}
		return null;
	}
}
