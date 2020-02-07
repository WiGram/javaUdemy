package gram.william;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contactList = new Contacts();

    // 0
    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contacts list.");
        System.out.println("\t 2 - To add a new contact");
        System.out.println("\t 3 - To modify a contact in the list");
        System.out.println("\t 4 - To remove a contact from the list");
        System.out.println("\t 5 - To search for a contact");
        System.out.println("\t 6 - To quit the application");
    }

    // 1
    public static void getContactList() {
        contactList.getContactList();
    }

    // 2
    public static void addContact() {
        System.out.println("Please enter contact name to add: ");
        String contactName = scanner.nextLine();
        System.out.println("Please enter contact number to add: ");
        int contactNumber = scanner.nextInt();
        scanner.nextLine();
        contactList.addContact(contactName, contactNumber);
    }

    // 3
    public static void modifyContact() {
        System.out.println("Write existing contact name: ");
        String currentContact = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        int newNumber = scanner.nextInt();
        scanner.nextLine();
        contactList.modifyContact(currentContact, newNumber);
    }

    // 4
    public static void removeContact() {
        System.out.println("Enter contact to remove: ");
        String currentContact = scanner.nextLine();
        contactList.removeContact(currentContact);
    }

    // 5
    public static void searchForContact() {
        System.out.println("Enter contact name to search for: ");
        String searchContact = scanner.nextLine();
        contactList.searchForContact(searchContact);
    }
}
