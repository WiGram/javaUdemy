package gram.william;

public class EnhancedContact {
    private String name;
    private String phoneNumber;

    public EnhancedContact(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Static method to create new contact record without initialising an individual contact instance
    public static EnhancedContact createContact(String name, String phoneNumber) {
        return new EnhancedContact(name, phoneNumber);
    }
}
