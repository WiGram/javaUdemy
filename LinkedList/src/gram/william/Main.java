package gram.william;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim", 54.96);
	    Customer anotherCustomer;

	    // Java has anotherCustomer to point to customer - i.e. the same memory address.
	    anotherCustomer = customer;
	    anotherCustomer.setBalance(12.18);

        // Any changes made to anotherCustomer makes changes to the same memory location
        // as that used of the first customer object - i.e. they both change identically
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        System.out.println("Balance for customer " + anotherCustomer.getName() + " is " + anotherCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(1);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        // We have entered a new number at index 1 - every else gets pushed down.
        // This becomes demanding on processing power when arrays become large.
        intList.add(1, 2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        // A more efficient solution is to use linkedLists.
        // Linked lists store the memory location and the data (element in e.g. ArrayList)
        // and this construction makes list manipulations more efficient
    }
}
