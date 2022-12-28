package SOLID_Principles.Liskov.better;

public class HomeLoan implements SecureLoan{
    @Override
    public void doPayment(int amount) {
        System.out.println("Payment done for Homeloan " + amount);
    }

    @Override
    public void forceCloseLoan() {
        System.out.println("Homeloan closed");
    }
}
