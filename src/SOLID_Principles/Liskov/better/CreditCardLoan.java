package SOLID_Principles.Liskov.better;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {
        System.out.println("Payment done for CreditCard Loan : " + amount);
    }
}
