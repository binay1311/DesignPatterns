package SOLID_Principles.SingleResponsibility;

public class TransactionOperations {
    public void deposit(int amount, int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount() + amount);

    }

    public void withdraw(int amount, int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount() - amount);

    }
}
