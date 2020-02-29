package gram.william;
import java.util.ArrayList;
public class Customer {
    // Each customer has a name and a list of transactions
    private ArrayList<Double> transactions;
    private String customerName;
    // private double customerBalance;  // create balance

    // constructor
    public Customer(double amount, String customerName) {
        // Set the first transaction (index 0) to inputted amount
        this.transactions.set(0, amount);
        this.customerName = customerName;
    }

    // Static method to return a Customer object without initialising a new contact
    public static Customer createCustomer(double transaction, String customerName) {
        return new Customer(transaction, customerName);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    // ----- Getters ----- //
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustomerName() {
        return customerName;
    }

    // ----- the end ----- //
}
