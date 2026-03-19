package AppStrategy;

import app.APP;
import device.Device;
import device.Light;

public class Night implements strategy {

	@Override
	public void excute(APP app) {
		// TODO Auto-generated method stub
		System.out.println("Night Mode Activated");
       for(Device device:app.devices)
       {
    	   if(device instanceof Light)
    	   {
    		   device.on();
    	   }
    	   else {
    		   device.off();
    	   }
       }

	}

}
