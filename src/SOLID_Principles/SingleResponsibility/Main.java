package SOLID_Principles.SingleResponsibility;

public class Main {
    public static void main(String args[]){
        Account account = new Account();
        account.setAccountNumber(101);
        account.setFirstName("Binay");
        account.setTotalAmount(1000);

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(500, 101);
        transactionOperations.withdraw(200, 101);

        System.out.println(account.getTotalAmount());
    }
}
