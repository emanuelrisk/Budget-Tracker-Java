import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleBudgetTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Transaction> transactions = new ArrayList<>();
        double balance = 0.0;

        while (true) {
            System.out.println("Simple Budget Tracker");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount for income: ");
                    double incomeAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    transactions.add(new Transaction("Income", incomeAmount));
                    balance += incomeAmount;
                    System.out.println("Income added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the amount for expense: ");
                    double expenseAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character
                    transactions.add(new Transaction("Expense", expenseAmount));
                    balance -= expenseAmount;
                    System.out.println("Expense added successfully.");
                    break;
                case 3:
                    System.out.println("Current Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Transaction {
    private String category;
    private double amount;

    public Transaction(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}
