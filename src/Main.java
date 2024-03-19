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

    }

}
