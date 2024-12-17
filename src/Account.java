package pro;
import java.util.ArrayList;
import java.util.List;
public class Account {
    private int accountNumber;
    private String accountType;
    private double balance;
    private String accountHolderName;
    private String accountHolderEmail;
    private List<Transaction> transactionHistory;
    public Account(int accountNumber, String accountType, String accountHolderName, String accountHolderEmail) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountHolderName = accountHolderName;
        this.accountHolderEmail = accountHolderEmail;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }
    public void deposit(double amount) {
        balance += amount;
        recordTransaction("Deposit", amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            recordTransaction("Withdrawal", amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public void viewTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transaction history available.");
        } else {
            for (Transaction transaction : transactionHistory) {
                System.out.println(transaction.getTransactionDetails());
            }
        }
    }
    private void recordTransaction(String transactionType, double amount) {
        String date = "";
        Transaction transaction = new Transaction(transactionHistory.size() + 1, transactionType, amount, balance, date);
        transactionHistory.add(transaction);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }
}
