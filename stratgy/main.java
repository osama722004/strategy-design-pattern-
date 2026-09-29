package stratgy;

public class main {

    public static void main(String[] args) {
        System.out.println("hello world");
        Order order = new Order();
        order.SetPaymentMethod(new CashPayment());
        order.performPayment();
        try {
            order.SetPaymentMethod(new CardPayment());
            order.performPayment();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            order.SetPaymentMethod(new WalletPay());
            order.performPayment();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
/*
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

package stratgy;

public class CardPayment extends Pay {

    @Override
    public void pay(double amount) {
        if (super.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient balance to complete payment.");
        }
        System.out.println("payment process done using bank card \n");
    }

}

package stratgy;

public class CashPayment extends Pay {

    @Override
    public void pay(double amount) {
        System.out.println("payment process is cash on delivery \n");

    }
}

package stratgy;

public class WalletPay extends Pay {

    @Override
    public void pay(double amount) {
        if (super.getBalance() < amount) {
            throw new IllegalArgumentException("Insufficient balance to complete payment.");
        }
        System.out.println("payment process done using degital wallet \n");
    }
;
}

package stratgy;

public class Order {

    private Pay pay;
    private double orderAmount = 30;

    public Order() {
    }

    public void SetPaymentMethod(Pay pay) {
        this.pay = pay;
    }

    public void performPayment() {
        this.pay.pay(orderAmount);
    }
}

package stratgy;

public class main {

    public static void main(String[] args) {
        System.out.println("hello world");
        Order order = new Order();
        order.SetPaymentMethod(new CashPayment());
        try {
            order.performPayment();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
 */
