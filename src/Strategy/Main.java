package Strategy;

public class Main {
    public static void main(String[] args) {
        Payment cc=new CreditCard();
        Payment gPay=new GooglePay();

        Order order=new Order("AX-100", 19000, gPay);
        order.placeOrder();
    }
}
