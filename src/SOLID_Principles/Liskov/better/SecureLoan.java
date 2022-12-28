package SOLID_Principles.Liskov.better;

public interface SecureLoan extends LoanPayment{
    public void forceCloseLoan();
}
