package state;

import userEntities.Card;

public interface state {
    //withdraw cash
    //check balance
    //enter pin
    public void withdrawCash(double amount);
    public void checkBalance();
    public void enterPin(int pin);
    public void enterCard(Card card);
    public void exit();
}
