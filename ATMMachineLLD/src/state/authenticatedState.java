package state;

import machine.ATMMachine;
import userEntities.Card;

public class authenticatedState implements state {
    private ATMMachine machine;
    public authenticatedState(ATMMachine machine) {
    this.machine=machine;
    }

    @Override
    public void withdrawCash(double amount) {
        if(amount>=machine.getCard().getAccount().getBalance())
        {
            System.out.println("Insufficient Balance");
            return;
        }
        machine.getCard().getAccount().setBalance(machine.getCard().getAccount().getBalance()-amount);
        System.out.println(amount+" has been drawn successfully");
    }

    @Override
    public void checkBalance() {
        System.out.println("Total Amount:" +machine.getCard().getAccount().getBalance());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Already authenticated");
    }
    public void enterCard(Card card) {
        System.out.println("Session already active");
    }

    @Override
    public void exit() {
        machine.setCurrent(new idleState(machine));
        machine.setCard(null);
    }
}
