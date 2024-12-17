package pro;
import java.time.LocalDate;
public class Transaction {
    private int transactionId;
    private String transactionType;
    private double amount;
    private double balanceAfterTransaction;
    private String date;

    public Transaction(int transactionId, String transactionType, double amount, double balanceAfterTransaction, String date) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.date = LocalDate.now().toString();
       
    }

    public String getTransactionDetails() {
       return "\nTransaction ID: " + transactionId +
                "\nType: " + transactionType +
                "\nAmount: " + amount +
                "\nBalance After: " + balanceAfterTransaction +
                "\nDate: " + date;
    }
}
