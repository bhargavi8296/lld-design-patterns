public class selectedState implements State {
    VendingMachine vm;
    selectedState(VendingMachine vm)
    {
        this.vm=vm;
    }
    @Override
    public void selectedProduct(int id) {
        System.out.println("Product has already been selected");
    }

    @Override
    public void insertedMoney(double amount) {
            vm.setAmount(vm.getAmount()+amount);
            if(vm.getAmount()>=vm.getSelectedProduct().getPrice())
            {
                vm.setState(new moneyInsertedState(vm));
            }
    }

    @Override
    public void despenseProduct() {
        System.out.println("Insert the appropriate amount First");
    }
}
