package SOLID_Principles.SingleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static Map<Integer, Account> accountMap = new HashMap<>();
    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }

    /** Adding this method violates Single Responsibility Principle
     * AccountOperations is responsible for doing operations related to account like
     * addAccount, updateAcount, getAccount.
     * Deposit is something called as transaction and doesnt fall under accountOperations.
     * @param amount
     * @param accountNumber
     */
    public void deposit(int amount, int accountNumber){

    }
}
