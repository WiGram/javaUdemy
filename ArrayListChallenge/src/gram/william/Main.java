package gram.william;

import java.beans.EventHandler;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // private static MobilePhone phone = new MobilePhone();
    private static EnhancedPhone phone = new EnhancedPhone("0039 330 4404");

    public static void main(String[] args) {
        boolean quit = false;

        int choice = 0;
        phone.printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    phone.getContactList();
                    break;
                case 2:
                    phone.addContact();
                    break;
                case 3:
                    phone.modifyContact();
                    break;
                case 4:
                    phone.removeContact();
                    break;
                case 5:
                    phone.searchForContact();
                    break;
                case 6:
                    phone.printInstructions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
}
