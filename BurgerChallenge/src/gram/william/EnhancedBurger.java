package gram.william;

import java.util.Locale;
import java.util.Scanner;

public class EnhancedBurger {
    private int bunType = 1;
    private int meatSize = 250;
    private String additionOne = null;
    private double additionOnePrice;
    private String additionTwo = null;
    private double additionTwoPrice = 0.00;
    private String additionThree = null;
    private double additionThreePrice = 0.00;
    private String additionFour = null;
    private double additionFourPrice = 0.00;
    protected double price = 5.00d;

    public EnhancedBurger() {
        System.out.println("Constructor to be configured");
    }

    private void addAdditionOne(Scanner scanner){
        System.out.println("Enter extra to add to burger: ");
        this.additionOne = scanner.nextLine();
        System.out.println("Enter price of extra: ");
        this.additionOnePrice = scanner.nextDouble();
        this.price += this.additionOnePrice;
        scanner.nextLine();
    }

    private void addAdditionTwo(Scanner scanner) {
        System.out.println("Enter extra to add to burger: ");
        this.additionTwo = scanner.nextLine();
        System.out.println("Enter price of extra: ");
        this.additionTwoPrice = scanner.nextDouble();
        this.price += this.additionTwoPrice;
        scanner.nextLine();
    }

    private void addAdditionThree(Scanner scanner) {
        System.out.println("Enter extra to add to burger: ");
        this.additionThree = scanner.nextLine();
        System.out.println("Enter price of extra: ");
        this.additionThreePrice = scanner.nextDouble();
        this.price += this.additionThreePrice;
        scanner.nextLine();
    }

    private void addAdditionFour(Scanner scanner) {
        System.out.println("Enter extra to add to burger: ");
        this.additionFour = scanner.nextLine();
        System.out.println("Enter price of extra: ");
        this.additionFourPrice = scanner.nextDouble();
        this.price += this.additionFourPrice;
        scanner.nextLine();
    }

    public void itemizeBurger() {
        System.out.println("How many extras would you like to add? (maximum of four)");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

        if (!scanner.hasNextInt()) {
            System.out.println("Wrong input type");
            scanner.close();
            return;
        }
        int extras = scanner.nextInt();
        scanner.nextLine();
        switch(extras) {
            case 1:
                addAdditionOne(scanner);
                break;
            case 2:
                addAdditionOne(scanner);
                addAdditionTwo(scanner);
                break;
            case 3:
                addAdditionOne(scanner);
                addAdditionTwo(scanner);
                addAdditionThree(scanner);
                break;
            case 4:
                addAdditionOne(scanner);
                addAdditionTwo(scanner);
                addAdditionThree(scanner);
                addAdditionFour(scanner);
                break;
            default:
                break;
        }
        System.out.println("Your final price is " + this.price);
        scanner.close();
    }

    public String getAdditionOne() {
        return additionOne;
    }
}
