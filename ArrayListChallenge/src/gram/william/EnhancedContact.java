package gram.william;

public class EnhancedContact {
    // Every contact has a name and a number
    private String name;
    private String phoneNumber;

    // Constructor
    public EnhancedContact(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }

    // Static method to return a contact object without initialising a new contact
    public static EnhancedContact createContact(String name, String phoneNumber) {
        return new EnhancedContact(name, phoneNumber);
    }

    // ---- Getters ---- //
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    // ------------------ //
}
