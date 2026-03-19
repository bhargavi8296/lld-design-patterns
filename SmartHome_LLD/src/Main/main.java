package Main;
import app.*;
import AppStrategy.*;
import FactoryDevice.LightFactory;
import device.*;
import LightDecorator.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APP app=new APP();
		strategy s=new Auto();
		Device l1=LightFactory.getFactory().getDevice();
		l1=new DimLight(new SmartLight(l1));
		Device l2=new Fan();
		Device l3=new AC();
		app.addDevice(l1);
		app.addDevice(l2);
		app.addDevice(l3);
		s.excute(app);
		app.exited();
	}

}
