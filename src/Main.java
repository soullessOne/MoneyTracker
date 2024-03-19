import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Account account = new Account();

    public static void main(String[] args){
        System.out.println("Welcome to the console money tracker app");

        boolean isRunning = true;
        while(isRunning){
            displayMenu();
            int choice = scanner.nextInt();
            System.out.println(); //just for good-looking in console
            switch (choice){
                case 1:
                    account.viewBalance();
                    break;
                case 2:
                    addTransaction();
                    break;
                case 3:
                    account.viewTransactions();
                    break;
                case 4:
                    account.generateReport();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Thank you for using Money Tracker!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
    private static void displayMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. View Account Balance");
        System.out.println("2. Add Transaction");
        System.out.println("3. View Transactions");
        System.out.println("4. Generate Report");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addTransaction() {
        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        String type = null;
        boolean validType = false;
        while (!validType) {
            System.out.print("Select transaction type \n1. Income \n2. Expense: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                type = "Income";
                validType = true;
            } else if (choice == 2) {
                type = "Expense";
                validType = true;
            } else {
                System.out.println("Invalid syntax, please select correct");
            }
        }

        String moneyType = null;
        boolean validMoneyType = false;
        while (!validMoneyType) {
            System.out.print("Select transaction type \n1. Card \n2. Cash: ");
            int moneyChoice = scanner.nextInt();
            if (moneyChoice == 1) {
                moneyType = "Card";
                validMoneyType = true;
            } else if (moneyChoice == 2) {
                moneyType = "Cash";
                validMoneyType = true;
            } else {
                System.out.println("Invalid syntax, please select correct");
            }
        }

        System.out.println("Enter transaction description: ");
        String description = scanner.next();

        Transaction transaction = new Transaction(amount, type, description, moneyType);
        account.addTransaction(transaction);

        System.out.println("Transaction added successfully.");
    }

}
