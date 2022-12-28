package SOLID_Principles.Liskov.bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {
        System.out.println("Payment done for CreditCardLoan " + amount);
    }

    @Override
    public void forceCloseLoan() {
        throw new UnsupportedOperationException("Force closure is not allowed");
    }

    @Override
    public void doRepayment(int amount) {
        System.out.println("Re-Payment done for CreditCardLoan " + amount);
    }
}
