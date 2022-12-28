package Strategy;

public class CreditCard implements Payment{
    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting credit card details..");
    }

    @Override
    public void doPayment() {
        System.out.println("Payment done suceessfully by Credit Card");
    }
}
