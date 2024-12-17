package pro;
import java.util.Scanner;
public class Processor {
    private Bank bank;
    private Account currentAccount;
    private Scanner scanner;

    public Processor() {
        bank = new Bank();
        scanner = new Scanner(System.in);
    }

    public void createAccount() {
        System.out.print("Enter account number (6 digits): ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter account type (Savings/Checking): ");
        String accountType = scanner.nextLine();
        System.out.print("Enter your full name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String accountHolderEmail = scanner.nextLine();

        currentAccount = bank.createAccount(accountType, accountHolderName, accountHolderEmail, accountNumber);

        if (currentAccount != null) {
            System.out.println("Account created successfully! Account Number: " + currentAccount.getAccountNumber());
        }
    }

    public void deposit() {
        if (currentAccount == null) {
            System.out.println("Please create an account first.");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character

        if (amount > 0) {
            currentAccount.deposit(amount);
            System.out.println("Deposited successfully! New balance: " + currentAccount.getBalance());
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public void withdraw() {
        if (currentAccount == null) {
            System.out.println("Please create an account first.");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character

        if (amount > 0) {
            currentAccount.withdraw(amount);
            System.out.println("Withdrawal successful! New balance: " + currentAccount.getBalance());
        } else {
            System.out.println("Amount must be positive.");
        }
    }

    public void checkBalance() {
        if (currentAccount == null) {
            System.out.println("Please create an account first.");
            return;
        }

        currentAccount.checkBalance();
    }

    public void viewTransactionHistory() {
        if (currentAccount == null) {
            System.out.println("Please create an account first.");
            return;
        }

        currentAccount.viewTransactionHistory();
    }

    public boolean hasAccount() {
        return currentAccount != null;
    }
}
