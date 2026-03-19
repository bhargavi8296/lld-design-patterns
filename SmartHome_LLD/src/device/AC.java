package device;

public class AC implements Device {
	private int temp;
	private boolean isOn;
	public AC()
	{
		temp=20;
		isOn=false;
	}
	public void on() {
		// TODO Auto-generated method stub
		isOn=true;
		System.out.println("AC is On");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		isOn=false;
		System.out.println("AC is OFF");
	}
	public void increaseTemperature()
	{
		if(temp<25) {++temp;}
		System.out.println("Temperature of AC is: "+temp);
	}
	public void decreaseTemperature()
	{
		if(temp>18) {--temp;}
		System.out.println("Temperature of AC is: "+temp);
	}
	@Override
	public void update(String event) {
		// TODO Auto-generated method stub
		if(event.equals("ENTER")) {on();}
		else {off();}

	}

}
