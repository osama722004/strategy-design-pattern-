package stratgy;

public abstract class Pay {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    ;

    public abstract void pay(double amount);
}
