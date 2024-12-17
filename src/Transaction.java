package pro;
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
        this.date = date;
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId +
                ", Type: " + transactionType +
                ", Amount: " + amount +
                ", Balance After: " + balanceAfterTransaction +
                ", Date: " + date;
    }
}
