package gram.william;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranches;  // ArrayList holding Branch class objects
    private static Scanner scanner = new Scanner(System.in);

    // Constructor
    public Bank(String bankName, ArrayList<Branch> bankBranches) {
        this.bankName = bankName;
        this.bankBranches = bankBranches;
    }

    // static constructor to create Bank object in-line.
    public static Bank createBank(String bankName, ArrayList<Branch> bankBranches) {
        return new Bank(bankName, bankBranches);
    }
/*
    public void addBranch() {
        System.out.println("Enter new customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter initial transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        Branch newBranch = Branch.createBranch(String name, ArrayList<Branch> bankBranch);
        //  The below statement is true if the customer was successfully added
        if (this.addNewBranch(newBranch)) {
            System.out.println(
                    "New customer added. Name: " +
                            newBranch.getBranchName() +
                            " with an initial transaction of: " +
                            newBranch.getBranchName().indexOf(0)
            );
        } else {
            System.out.println("Cannot add an existing customer to the branch.");
        }
    }

 */

    private boolean addNewBranch(Branch branch) {
        if (this.findBranch(branch) > 0) {
            System.out.println("Customer already exists in the branch.");
            return false;
        }
        bankBranches.add(branch);
        return true;
    }

    // ----- Helpers ----- //
    private int findBranch(Branch branch) {
        return this.bankBranches.indexOf(branch);
    }

    private int findBranch(String branchName) {
        // test to see if any of the customer names matches the input
        for (int i=0; i < this.bankBranches.size(); i++) {
            Branch branch = this.bankBranches.get(i);

            if (branch.getBranchName().equals(branchName)) return i;
        }

        return -1;
    }
}
