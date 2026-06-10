import java.util.*;
public class Inventory {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(int id, Product product) {
        products.put(id, product);
    }

    public Product getProduct(int id) {
        return products.get(id);
    }
    public boolean isAvailable(int id) {
        Product product = products.get(id);
        return product != null && product.isAvailable();
    }
}
