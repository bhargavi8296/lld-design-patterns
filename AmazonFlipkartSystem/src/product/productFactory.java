package product;

public class productFactory {
	public product getProduct(String str)
	{
		if(str.equalsIgnoreCase("ELECTRONICS")) {return new Electronics();}
		else if(str.equalsIgnoreCase("CLOTHING")) {return new Clothing();}
		else if(str.equalsIgnoreCase("GROCERY")) {return new Grocery();}
		return null;
	}
}
