package observer;

public class customer implements observer {
	String name;
	public customer(String name)
	{
		this.name=name;
	}
	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println(name+" "+msg);
		
	}

}
