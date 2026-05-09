package Observer;

public class User implements Subscriber {

	String name;
	public User(String name)
	{
		this.name=name;
	}
	public void update(String msg,String name) {
		// TODO Auto-generated method stub
		System.out.println(this.name+" "+msg+" has been added on channel "+name);
	}

}
