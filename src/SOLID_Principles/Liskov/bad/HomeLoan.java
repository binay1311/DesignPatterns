package SOLID_Principles.Liskov.bad;

public class HomeLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {
        System.out.println("Payment done for Homeloan " + amount);
    }

    @Override
    public void forceCloseLoan() {
        System.out.println("Homeloan closed");
    }

    @Override
    public void doRepayment(int amount) {
        System.out.println("Re-Payment done for Homeloan " + amount);
    }
}
