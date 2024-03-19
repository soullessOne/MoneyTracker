import java.util.ArrayList;
import java.util.List;

public class Account {
    private double cashBalance;
    private double cardBalance;
    private double AllBalance ;
    private List<Transaction> transactions = new ArrayList<>();

    public void viewBalance() {

    }

    public void viewTransactions() {
        System.out.println(transactions);
    }

    public void generateReport() {
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
