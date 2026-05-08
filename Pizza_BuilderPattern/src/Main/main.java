package Main;
import pizza.*;
import pizzaBuilder.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pizza pizza1 = new builder("Large", "Thin Crust").setCheese("Mozzarella").setToppings("Onion")
		        .setToppings("Mushroom")
		        .setExtraCheese()
		        .setStuffedCrust()
		        .setSauce("BBQ")
		        .build();
		pizza1.show();
		System.out.println();
		pizza pizza2 = new builder("Medium", "Thick Crust")
                .setToppings("Paneer")
                .setSauce("Tomato")
                .build();
		pizza2.show();
		System.out.println();
		try {
		pizza pizza3 = new builder().build();
		pizza3.show();
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}

			
	}

}
