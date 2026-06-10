public class moneyInsertedState implements State {
    VendingMachine vm;
    moneyInsertedState(VendingMachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void selectedProduct(int id) {
        System.out.println("Product has been Selected");
    }

    @Override
    public void insertedMoney(double amount) {
        System.out.println("Money has been inserted");
    }

    @Override
    public void despenseProduct() {
        Product product=vm.getSelectedProduct();
        product.setQuantity(product.getQuantity()-1);
        System.out.println(
                "Dispensed: "
                        + product.getName()
        );
        double change =
                vm.getAmount()
                        - product.getPrice();
        System.out.println(
                "Change returned: "
                        + change
        );

        vm.setAmount(0);
        vm.setSelectedProduct(null);

        vm.setState(
                new idleState(vm)
        );
    }
}
