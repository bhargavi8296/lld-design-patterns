package addOns;
import order.*;
public abstract class addOns implements order{

	public order order;
	addOns(order o)
	{
		order=o;
	}
}
