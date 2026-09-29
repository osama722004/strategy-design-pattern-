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
