package pro;
import java.util.Scanner;
public class BankingSystem {
    private static Processor processor = new Processor();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    processor.createAccount();
                    break;
                case 2:
                    processor.deposit();
                    break;
                case 3:
                    processor.withdraw();
                    break;
                case 4:
                    processor.checkBalance();
                    break;
                case 5:
                    processor.viewTransactionHistory();
                    break;
                case 6:
                    System.out.println("Exiting the system...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
