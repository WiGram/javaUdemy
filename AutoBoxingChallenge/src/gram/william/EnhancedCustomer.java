package gram.william;

import java.util.ArrayList;

public class EnhancedCustomer {
    private String name;
    private ArrayList<Double> transactions;

    public EnhancedCustomer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);  // Autoboxing - converting from a primitive to an object wrapper
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
