package gram.william;

import java.util.ArrayList;

public class Contacts {

    private ArrayList<String> contactNames = new ArrayList<String>();
    private ArrayList<Integer> contactNumbers = new ArrayList<Integer>();

    // 1 - get contact list
    public void getContactList() {
        System.out.println("You have " + contactNames.size() + " contacts in your contact list");
        for (int i = 0; i < contactNames.size(); i++) {
            System.out.println(
                    "Contact " + contactNames.get(i) +
                    " has number " + contactNumbers.get(i)
            );
        }
    }

    // ----- Private functions ----- //
    private int findContactPosition(String contactName) {
        return contactNames.indexOf(contactName);
    }

    private int findContactPosition(int contactNumber) {
        return contactNames.indexOf(contactNumber);
    }

    private String getContactName(int position) {
        return contactNames.get(position);
    }

    private int getContactNumber(int position) {
        return contactNumbers.get(position);
    }

    private void removeContact(int position) {
        contactNames.remove(position);
        contactNumbers.remove(position);
    }

    private boolean onFile(String contactName) {
        int position = findContactPosition(contactName);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    private boolean onFile(int contactNumber) {
        int position = findContactPosition(contactNumber);
        if (position >= 0) {
            return true;
        }
        return false;
    }
    // ------------------------------ //

    // 2 - add contact
    public void addContact(String contactName, int contactNumber) {
        System.out.println("Please enter contact name: ");

        if (onFile(contactName)){
            System.out.println("Contact already on file. Try another name");
        } else {
            contactNames.add(contactName);
            System.out.println("Please enter contact number: ");
            contactNumbers.add(contactNumber);
        }
    }

    // 3 - modify contact
    public void modifyContact(String currentContact, int newNumber) {
        int position = findContactPosition(currentContact);
        String theContact = getContactName(position);
        if (position > 0) {
            int oldNumber = contactNumbers.get(position);
            // .set Changes value at index [position] to that of newContact -
            // i.e. at [position] set value to [newContact]
            contactNumbers.set(position, newNumber);
            System.out.println(
                    "Contact no. " + oldNumber +
                            " has been modified to " + newNumber
            );
        }
    }

    // 4 - remove contact
    public void removeContact(String currentContact) {
        int position = findContactPosition(currentContact);
        String theContact = getContactName(position);
        if (position >= 0) {
            removeContact(position);
        }
        System.out.println("Contact " + theContact + " has been deleted.");
    }

    // 5 - search for contact - actual searching done in MobilePhone
    public void searchForContact(String contactName) {
        System.out.println("Contact to search for: ");
        if (onFile(contactName)) {
            int position = findContactPosition(contactName);
            int contactNumber = getContactNumber(position);
            System.out.println(contactName + " has number ");
        } else {
            System.out.println(contactName + " is not in your contact list");
        }
    }

    public void searchForContact(int contactNumber) {
        System.out.println("Contact to search for: ");
        if (onFile(contactNumber)) {
            int position = findContactPosition(contactNumber);
            String contactName = getContactName(position);
            System.out.println(contactNumber + " belongs to " + contactName);
        } else {
            System.out.println(contactNumber + " is not in your contact list");
        }
    }
}
