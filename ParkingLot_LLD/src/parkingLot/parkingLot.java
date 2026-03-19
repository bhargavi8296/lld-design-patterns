package parkingLot;

import java.util.*;

import Slot.*;
import Ticket.Ticket;
import vehicle.*;

public class parkingLot {
	int ticketId;
	int capacity;
	List<slot>slots;
	public parkingLot( int capacity)
	{
		slots=new ArrayList<>();
		ticketId=0;
		this.capacity=capacity;
		for(int i=0;i<capacity;++i)
		{
			slots.add(new slot(i,false));
		}
	}
	public Ticket park(vehicle vehicle)
	{
		for(slot s:slots)
		{
			if(!s.isAlloted())
			{
				s.alot(true);
				System.out.println("Vehicle "+vehicle.getType()+" is parked at slot: "+s.slot);
				Ticket t=new Ticket(++ticketId,vehicle,s);
				return t;
			}
		}
		System.out.println("Parking Lot is full");
		return null;
	}
	public void unpark(Ticket ticket)
	{
		
		ticket.slot.set(false);
		System.out.print("Pay 50 Ruppee");
	}
}
