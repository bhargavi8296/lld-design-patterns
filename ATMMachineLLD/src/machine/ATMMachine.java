package machine;
import state.*;
import userEntities.Card;

public class ATMMachine {
    state current;
    Card card;
    private static ATMMachine instance;
    public ATMMachine(){
        current =new idleState(this);
    }
    public static ATMMachine getInstance()
    {
        if(instance==null)
        {
            instance=new ATMMachine();
        }
        return instance;
    }
    public state getCurrent() {
        return current;
    }

    public void setCurrent(state current) {
        this.current = current;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    public void enterCard(Card card)
    {
        current.enterCard(card);
    }
    public void enterPin(int pin)
    {
        current.enterPin(pin);
    }
    public void checkBalance()
    {
        current.checkBalance();
    }
    public void withdrawCash(double amount)
    {
        current.withdrawCash(amount);
    }
    public void finish()
    {
        current=new idleState(this);
        card=null;
    }
}
