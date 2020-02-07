package gram.william;

import java.util.ArrayList;
import java.util.Scanner;

public class EnhancedPhone {
    private String myNumber;
    private ArrayList<EnhancedContact> myContacts;  // the array list holds EnhancedContact elements
    private static Scanner scanner = new Scanner(System.in);

    // the constructor
    public EnhancedPhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<EnhancedContact>();
    }

    private boolean addNewContact(EnhancedContact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        EnhancedContact newContact = EnhancedContact.createContact(name, number);
        if (addNewContact(newContact)) {
            System.out.println(
                    "New contact added. Name: " +
                            newContact.getName() +
                            ", Phone: " +
                            newContact.getPhoneNumber()
            );
        } else {
            System.out.println("Cannot add, " + name + ", as it's already in list.");
        }
    }

    private boolean updateContact(EnhancedContact oldContact, EnhancedContact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public void modifyContact() {
        System.out.println("Enter contact to modify: ");
        String name = scanner.nextLine();
        EnhancedContact existingContact = this.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();
        EnhancedContact newContact = EnhancedContact.createContact(newName, newNumber);
        this.updateContact(existingContact, newContact);
        System.out.println("Contact: " + name + " has been updated.");
    }

    private boolean removeContact(EnhancedContact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    public void removeContact() {
        System.out.println("Enter contact name to remove: ");
        String name = scanner.nextLine();
        EnhancedContact existingContact = this.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        this.removeContact(existingContact);
        System.out.println("Contact: " + name + " has been deleted.");
    }

    public void getContactList() {
        System.out.println("Contact list");
        for (int i=0; i < this.myContacts.size(); i++) {
            System.out.println(
                    // index number (human reading)
                    (i+1) + ". " +
                    // take contact index i (comp reading)
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber()
                    );
        }
    }

    public void printInstructions() {
        System.out.println("\n Available actions: \n press");
        System.out.println(
                "0 - to shutdown \n" +
                        "1 - to print contacts \n" +
                        "2 - to add a new contact \n" +
                        "3 - to update existing contact \n" +
                        "4 - to remove an existing contact \n" +
                        "5 - query if contact exists in list \n" +
                        "6 - to print a list of available actions."
        );

        System.out.println("Choose your action: ");
    }

    private EnhancedContact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void searchForContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        EnhancedContact existingContact = this.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println(
                "Name: " + existingContact.getName() +
                        " phone number is: " + existingContact.getPhoneNumber());
    }

    // inputting a contact object record
    // remember, the arraylist holds EnhancedContact elements
    private int findContact(EnhancedContact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        // we loop through all the contacts in the contact list
        for (int i=0; i < this.myContacts.size(); i++) {
            EnhancedContact contact = this.myContacts.get(i);

            // if we find a contact equal to that which we are searching for, we return its index
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }

        // If we don't find it, we return the standard error value
        return -1;
    }
}
