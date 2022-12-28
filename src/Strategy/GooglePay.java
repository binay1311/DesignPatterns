package Strategy;

public class GooglePay implements Payment{
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting Google Pay details..");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment done successfully by GPAY");
    }
}
