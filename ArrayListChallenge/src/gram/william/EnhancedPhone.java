package gram.william;

import java.util.ArrayList;
import java.util.Scanner;

public class EnhancedPhone {
    private String myNumber;  // In case we would want to always have the owners number in the phone
    private ArrayList<EnhancedContact> myContacts;  // the array list holds EnhancedContact elements
    private static Scanner scanner = new Scanner(System.in);

    // the constructor
    public EnhancedPhone(String myNumber) {
        this.myNumber = myNumber;  // The user's phone number
        this.myContacts = new ArrayList<EnhancedContact>();  // A list of contacts with names and numbers
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

    // method 1
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

    // method 2
    public void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();

        // generate a contact with entered names and numbers
        EnhancedContact newContact = EnhancedContact.createContact(name, number);
        if (this.addNewContact(newContact)) {
            System.out.println(
                    "New contact added. Name: " + newContact.getName() +
                            ", Phone: " + newContact.getPhoneNumber()
            );
        } else {
            System.out.println("Cannot add, " + name + ", as it's already in list.");
        }
    }

    private boolean addNewContact(EnhancedContact contact) {
        // Ensure contact doesn't already exist
        if (this.findContact(contact) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        // When the contact doesn't already exist - add it
        myContacts.add(contact);  // ArrayList has a built-in method to add an element
        return true;
    }

    // Method 3
    public void modifyContact() {
        System.out.println("Enter contact to modify: ");
        String name = scanner.nextLine();

        // Retrieve the contact of entered name from the contactList
        EnhancedContact existingContact = this.queryContact(name);

        // If the contact doesn't exist - end the method
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        // If the contact does exist - enter a name and number of replacing contact
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();

        // We are using the static constructor here
        EnhancedContact newContact = EnhancedContact.createContact(newName, newNumber);
        this.modifyContact(existingContact, newContact);
        System.out.println("Contact: " + name + " has been updated.");
    }

    private boolean modifyContact(EnhancedContact oldContact, EnhancedContact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful");
            return false;
        }

        // The old contact has index foundPosition. This contact is set to newContact instead
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    // method 4
    public void removeContact() {
        System.out.println("Enter contact name to remove: ");
        String name = scanner.nextLine();

        // Retrieve the contact from the contactList which has entered name
        EnhancedContact existingContact = this.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        // If found - remove the contact from the list of contacts
        this.removeContact(existingContact);
        System.out.println("Contact: " + name + " has been deleted.");
    }

    private boolean removeContact(EnhancedContact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        // Using built-in ArrayList method to remove element from list
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    // Method 5
    public void searchForContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();

        // Return the contact object that has the entered name
        EnhancedContact existingContact = this.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        // If it exists - print the associated name and number
        System.out.println(
                "Name: " + existingContact.getName() +
                " phone number is: " + existingContact.getPhoneNumber()
        );
    }

    // Helper functions
    private EnhancedContact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {

            // myContacts is a list of contacts. We return the contact with index = position
            return this.myContacts.get(position);
        }

        return null;
    }

    // Two finders - one using a contact, another just using a contact name
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
