package userEntities;

public class BankAccount {
    private int pin;
    private double balance;

    public int getPin() {
        return pin;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(int pin, double balance)
    {
        this.pin=pin;
        this.balance=balance;
    }
}
