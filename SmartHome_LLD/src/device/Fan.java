package device;

public class Fan implements Device {
	private int mode;
	private boolean isOn;
	public Fan()
	{
		mode=0;
		isOn=false;
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		isOn=true;
		System.out.println("Fan is On");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		isOn=false;
		System.out.println("Fan is Off");
	}
	public void increaseMode()
	{
		if(mode<5) {++mode;}
		System.out.println("Mode of Fan is: "+mode);
	}
	public void decreaseMode()
	{
		if(mode>0) {--mode;}
		System.out.println("Mode of Fan is: "+mode);
	}
	@Override
	public void update(String event) {
		// TODO Auto-generated method stub
		if(event.equals("ENTER")) {on();}
		else {off();}

	}

}
