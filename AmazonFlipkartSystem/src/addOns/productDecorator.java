package addOns;
import product.*;
public abstract class productDecorator implements product{
	product p;
	productDecorator(product p)
	{
		this.p=p;
	}
}
