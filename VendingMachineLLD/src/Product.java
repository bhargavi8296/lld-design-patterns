public class Product{
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int i, String name, int price, int quantity) {
        setId(i);
        setName(name);
        setQuantity(quantity);
        setPrice(price);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailable()
    {
        return quantity!=0;
    }
}
