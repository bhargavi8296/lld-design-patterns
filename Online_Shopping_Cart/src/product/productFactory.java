package product;

public class productFactory {
	public static product createProduct(String type) {
		if(type.equalsIgnoreCase("Laptop")) {return new product("Laptop",60000);}
		else if(type.equalsIgnoreCase("Mobile")) {return new product("Mobile",50000);}
		else if(type.equalsIgnoreCase("Headphone")) {return new product("HeadPhone", 20000);}
		return null;
	}
}
