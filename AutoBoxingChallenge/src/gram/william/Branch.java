package gram.william;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private String branchName;
    private ArrayList<Customer> branchCustomers;  // ArrayList holding Customer class objects
    private static Scanner scanner = new Scanner(System.in);

    public Branch(String branchName, ArrayList<Customer> branchCustomers) {
        this.branchName = branchName;
        this.branchCustomers = branchCustomers;
    }

    // static constructor to create Branch object in-line.
    public static Branch createBranch(String branchName, ArrayList<Customer> bankCustomer) {
        return new Branch(branchName, bankCustomer);
    }

    // method 1
    public void getCustomerList() {
        System.out.println("List of branch customers: ");
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            System.out.println(
                    (i+1) + ". " + this.branchCustomers.get(i).getCustomerName()
            );
        }
    }

    // method 2
    public void addCustomer() {
        System.out.println("Enter new customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter initial transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        Customer newCustomer = Customer.createCustomer(amount, name);
        //  The below statement is true if the customer was successfully added
        if (this.addNewCustomer(newCustomer)) {
            System.out.println(
                    "New customer added. Name: " +
                            newCustomer.getCustomerName() +
                            " with an initial transaction of: " +
                            newCustomer.getTransactions().indexOf(0)
            );
        } else {
            System.out.println("Cannot add an existing customer to the branch.");
        }
    }

    private boolean addNewCustomer(Customer customer) {
        if (this.findCustomer(customer) > 0) {
            System.out.println("Customer already exists in the branch.");
            return false;
        }
        branchCustomers.add(customer);
        return true;
    }

    // Method 3
    public void addCustomerTransaction() {
        System.out.println("Enter existing customer: ");
        String customerName = scanner.nextLine();
        int customerIndex = this.findCustomer(customerName);
        if (customerIndex > 0) {
            System.out.println("Customer found. Enter transaction amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            this.branchCustomers.get(customerIndex).addTransaction(amount);
        } else {
            System.out.println("No customer by this name found.");
        }
    }

    // Method 4
    public void getCustomerTransactions() {
        System.out.println("Enter existing customer: ");
        String customerName = scanner.nextLine();
        int customerIndex = this.findCustomer(customerName);
        if (customerIndex > 0) {
            System.out.println("Customer found. Displaying customer's transactions: ");
            this.branchCustomers.get(customerIndex).getTransactions();
        } else {
            System.out.println("No customer by this name found.");
        }
    }

    // ----- Helpers ----- //
    private int findCustomer(Customer customer) {
        return this.branchCustomers.indexOf(customer);
    }

    private int findCustomer(String customerName) {
        // test to see if any of the customer names matches the input
        for (int i=0; i < this.branchCustomers.size(); i++) {
            Customer customer = this.branchCustomers.get(i);

            if (customer.getCustomerName().equals(customerName)) return i;
        }

        return -1;
    }


    // ----- Getters ----- //
    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    // ----- The end ----- //
}
