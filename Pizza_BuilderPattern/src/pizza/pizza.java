package pizza;

import java.util.*;

import pizzaBuilder.builder;

public class pizza {

    private final String size;
    private final String base;
    private final String cheese;
    private final List<String> toppings;
    private final boolean extraCheese;
    private final boolean stuffedCrust;
    private final String sauce;

    public pizza(builder b) {
        this.size = b.getSize();
        this.base = b.getBase();
        this.cheese = b.getCheese();

        this.toppings = new ArrayList<>(b.getToppings());

        this.extraCheese = b.isExtraCheese();
        this.stuffedCrust = b.isStuffedCrust();
        this.sauce = b.getSauce();
    }

    public void show() {
        System.out.println("Pizza");

        System.out.println("Size: " + size);
        System.out.println("Cheese: " + cheese);

        System.out.print("Toppings: ");
        for (String str : toppings) {
            System.out.print(str + ", ");
        }

        System.out.println();
        System.out.println("Extra Cheese: " + extraCheese);
        System.out.println("Stuffed Crust: " + stuffedCrust);
        System.out.println("Sauce: " + sauce);
    }
}