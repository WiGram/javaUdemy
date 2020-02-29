package gram.william;

import java.util.ArrayList;

public class EnhancedBank {
    private String name;
    private ArrayList<EnhancedBranch> branches;

    public EnhancedBank(String name) {
        this.name = name;
        this.branches = new ArrayList<EnhancedBranch>();
    }

    public boolean addBranch(String branchName) {
        // if no such branch exists - generate it
        if (findBranch(branchName) == null) {
            this.branches.add(new EnhancedBranch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        EnhancedBranch branch = findBranch(branchName);
        // Cannot add the customer if the branch doesn't exist
        if (branch != null) {
            // below returns true if the operation was successful.
            return branch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        EnhancedBranch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private EnhancedBranch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            EnhancedBranch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        EnhancedBranch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details of branch " + branch.getName());

            ArrayList<EnhancedCustomer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                EnhancedCustomer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0 ; j < transactions.size(); j++)
                        System.out.println("[" + (j+1) + "]   Amount " + transactions.get(j));
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
