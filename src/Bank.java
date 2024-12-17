package pro;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts;
    private Map<String, Account> emailLookup;

    public Bank() {
        accounts = new HashMap<>();
        emailLookup = new HashMap<>();
    }

    public Account createAccount(String accountType, String name, String email, int accountNumber) {
        if (accountNumber < 100000 || accountNumber > 999999) {
            System.out.println("Invalid account number. Please enter a 6-digit account number.");
            return null;
        }

        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account number already exists. Please choose a different number.");
            return null;
        }

        Account newAccount = new Account(accountNumber, accountType, name, email);
        accounts.put(accountNumber, newAccount);
        emailLookup.put(email, newAccount);
        return newAccount;
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public Account getAccountByEmail(String email) {
        return emailLookup.get(email);
    }
}
