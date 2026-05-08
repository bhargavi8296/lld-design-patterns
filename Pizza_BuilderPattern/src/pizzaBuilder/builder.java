package pizzaBuilder;

import java.util.*;

import pizza.pizza;

public class builder {
	// required
    private String size;
    private String base;

    // optional
    private String cheese;
    private List<String> toppings = new ArrayList<>();
    private boolean extraCheese;
    private boolean stuffedCrust;
    private String sauce;
    public builder() {if (size == null || base == null) {
        throw new IllegalArgumentException("Size and Base are required");}
    }
    public builder(String size, String base)
    {
    	this.size=size;
    	this.base=base;
    }
    public pizza build()
    {
    	return new pizza(this);
    }
	public String getSize() {
		return size;
	}
	public String getBase() {
		return base;
	}
	public String getCheese() {
		return cheese;
	}
	public builder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public List<String> getToppings() {
		return toppings;
	}
	public builder setToppings(String topping) {
		toppings.add(topping);
		return this;
	}
	public builder setExtraCheese() {
		this.extraCheese=true;
		return this;
	}
	public builder setStuffedCrust() {
		this.stuffedCrust=true;
		return this;
	}
	public builder setSauce(String sauce) {
		this.sauce=sauce;
		return this;
	}
	public boolean isExtraCheese() {
		return extraCheese;
	}
	public boolean isStuffedCrust() {
		return stuffedCrust;
	}
	public String getSauce() {
		return sauce;
	}
}
