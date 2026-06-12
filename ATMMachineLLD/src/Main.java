import machine.ATMMachine;
import userEntities.BankAccount;
import userEntities.Card;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATMMachine machine=ATMMachine.getInstance();
        BankAccount account=new BankAccount(1234,200000);
        Card card=new Card(account);
        machine.enterCard(card);
        machine.enterPin(1234);
        machine.checkBalance();
        machine.withdrawCash(20000);
        machine.checkBalance();
        machine.finish();
    }
}