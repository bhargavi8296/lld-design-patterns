package userEntities;

public class Card {
    private BankAccount account;
    public Card(BankAccount account)
    {
        this.account=account;
    }

    public BankAccount getAccount() {
        return account;
    }
}
