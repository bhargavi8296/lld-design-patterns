package state;

import machine.*;
import userEntities.Card;

public class idleState implements state{
    private ATMMachine machine;
    public idleState(ATMMachine machine)
    {
        this.machine=machine;
    }
    @Override
    public void withdrawCash(double amount) {
        System.out.println("Enter the card First");
    }

    @Override
    public void checkBalance() {
        System.out.println("Enter the card First");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Enter the card First");
    }
    public void enterCard(Card card)
    {
        machine.setCard(card);
        machine.setCurrent(new enterPinState(machine));
        System.out.println("Card Inseted");
    }

    @Override
    public void exit() {
        System.out.println("Card has not been inserted");
    }
}
