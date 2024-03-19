public class Transaction {
    private double amount;
    private String type;
    private String description;
    private String moneyType;

    public Transaction(double amount, String type, String description, String moneyType) {
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.moneyType = moneyType;
    }
}
