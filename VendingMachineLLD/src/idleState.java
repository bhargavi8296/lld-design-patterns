public class idleState implements State {
    VendingMachine vm;
    idleState(VendingMachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void selectedProduct(int id) {
        Product product=vm.getProduct(id);
        if(product.getQuantity()==0)
        {
            System.out.println("Product Out of Stock");
            return;
        }
        vm.setSelectedProduct(product);
        vm.setState(
                new selectedState(vm));

    }

    @Override
    public void insertedMoney(double amount) {
        System.out.println("Select the product first");
    }

    @Override
    public void despenseProduct() {
        System.out.println("Select the product first");
    }
}
