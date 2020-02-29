package gram.william;

import java.util.ArrayList;

public class EnhancedBranch {
    private String name;
    private ArrayList<EnhancedCustomer> customers;

    public EnhancedBranch(String name) {
        this.name = name;
        this.customers = new ArrayList<EnhancedCustomer>();
    }

    public String getName() {
        return this.name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            // if not on file - good, we can add
            this.customers.add(new EnhancedCustomer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        EnhancedCustomer existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private EnhancedCustomer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            EnhancedCustomer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }

    public ArrayList<EnhancedCustomer> getCustomers() {
        return customers;
    }
}
