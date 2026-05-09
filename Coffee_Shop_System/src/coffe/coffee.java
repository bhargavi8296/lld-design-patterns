package coffe;


public class coffee {
	String type;
	boolean milk;
	boolean sugar;
	boolean extraShot;
	coffee(builder b)
	{
		this.type=b.type;
		this.milk=b.milk;
		this.sugar=b.sugar;
		this.extraShot=b.extraShot;
	}
	public void show()
	{
		System.out.println("Coffee: "+type);
		System.out.println("Extra Milk: "+(milk?"yes":"no"));
		System.out.println("Extra Sugar: "+(sugar?"yes":"no"));
		System.out.println("Extra Shot: "+(extraShot?"yes":"no"));
	}
}
