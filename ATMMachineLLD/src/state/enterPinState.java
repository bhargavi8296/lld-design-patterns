package state;

import machine.ATMMachine;
import userEntities.BankAccount;
import userEntities.Card;

public class enterPinState implements state{
    private ATMMachine machine;
    public enterPinState(ATMMachine machine)
    {
        this.machine=machine;
    }
    @Override
    public void withdrawCash(double amount) {
        System.out.println("Enter the pin First");
    }

    @Override
    public void checkBalance() {
        System.out.println("Enter the pin First");
    }

    @Override
    public void enterPin(int pin) {
            BankAccount account=machine.getCard().getAccount();
            if(account.getPin()==pin)
            {
                machine.setCurrent(new authenticatedState(machine));
            }
            else{
                System.out.println("Incorrect PIN");
                return;
            }
            System.out.println("PIN has been entered");
    }

    public void enterCard(Card card)
    {
        System.out.println("Card has been inserted");
    }

    @Override
    public void exit() {
        machine.setCurrent(new idleState(machine));
        machine.setCard(null);
    }
}
