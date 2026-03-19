package Ticket;
import vehicle.*;
import Slot.*;
public class Ticket {
	int id;
	vehicle vehicle;
	public slot slot;
	public Ticket(int id, vehicle vehicle,slot slot)
	{
		this.id=id;
		this.vehicle=vehicle;
		this.slot=slot;
	}
}
