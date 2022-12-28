package SOLID_Principles.Liskov.better;

public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(LoanPayment loanPayment){
        this.secureLoan = secureLoan;
    }

    public void forceCloseLoan() {
        secureLoan.forceCloseLoan();
    }
}
