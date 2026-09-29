package stratgy;

public class WalletPay extends Pay {

    @Override
    public void pay(double amount) {
        if (super.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient balance to complete payment.");
        }
        System.out.println("payment process done using degital wallet \n");
    }

}
