public class VendingMachine {
    private Inventory inventory;
    private Product selectedProduct;
    private State state;
    double amount;
    public static VendingMachine instance;
    public double getAmount() {
        return amount;
    }
    public void addProduct(int id, Product product)
    {
        inventory.addProduct(id,product);
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public static VendingMachine getInstance()
    {
        if(instance==null){instance=new VendingMachine();}
        return instance;
    }
    private VendingMachine()
    {
        inventory=new Inventory();
        state = new idleState(this);
    }
    public Product getProduct(int id)
    {
        return inventory.getProduct(id);
    }
    public Product getSelectedProduct() {
        return selectedProduct;
    }
    public void setSelectedProduct(Product pro) {
        selectedProduct=pro;
    }

    public void setState(State st)
    {
        state=st;
    }
    public void selectProduct(int productId) {
        state.selectedProduct(productId);
    }

    public void insertMoney(double amount) {
        state.insertedMoney(amount);
    }

    public void dispenseProduct() {
        state.despenseProduct();
    }

}
