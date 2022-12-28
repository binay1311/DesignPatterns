package Strategy;

public class Order {
    String orderID;
    int value;
    Payment method;

    public Order(String orderID, int value, Payment method) {
        this.orderID = orderID;
        this.value = value;
        this.method = method;
    }

    public void placeOrder() {
        method.collectPaymentDetails();
        method.doPayment();
    }
}
