package Main;

import parkingLot.parkingLot;
import vehicle.*;
import Ticket.Ticket;
import VehicleFactory.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parkingLot pL=new parkingLot(10);
		vehicle vh1=new CarFactory().getVehicle();
		vehicle vh2=new BikeFactory().getVehicle();
		Ticket t1=pL.park(vh1);
		Ticket t2=pL.park(vh2);
		pL.unpark(t1);

	}

}
