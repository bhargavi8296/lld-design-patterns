package coffe;

public class builder {
	String type;
	boolean milk;
	boolean sugar;
	boolean extraShot;
	public builder setType(String type) {
		this.type = type;
		return this;
	}
	public builder setMilk() {
		this.milk = true;
		return this;
	}
	public builder setSugar() {
		this.sugar = true;
		return this;
	}
	public builder setExtraShot() {
		this.extraShot = true;
		return this;
	}
	public coffee build()
	{
		return new coffee(this);
	}
}
