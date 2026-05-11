package smartHome;
import devices.*;
public class smartHome {
	private TV tv;
	private AC ac;
	private Light light;
	public smartHome()
	{
		tv=new TV();
		ac=new AC();
		light=new Light();
	}
	 public void startMovieMode() {
	        light.on();
	        ac.on();
	        tv.on();
	        System.out.println("Movie mode started");
	    }

	    public void stopMovieMode() {
	        light.off();
	        ac.off();
	        tv.off();
	        System.out.println("Movie mode stopped");
	    }
	    public void nightMode()
	    {
	    	light.off();
	    	ac.on();
	    	tv.off();
	    	System.out.println("Night mode activated");
	    }
	    public void offMode()
	    {
	    	light.off();
	    	ac.off();
	    	tv.off();
	    	System.out.println("Everything is Off");
	    }
	
}
