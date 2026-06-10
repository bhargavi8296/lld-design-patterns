//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VendingMachine machine =
                VendingMachine.getInstance();

        machine.addProduct(1, new Product(1,"Coke",40, 5));

        machine.selectProduct(1);

        machine.insertMoney(50);

        machine.dispenseProduct();
    }
}