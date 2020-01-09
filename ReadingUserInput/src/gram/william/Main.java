package gram.william;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        // new-keyword is to create a new >>instance<< of class Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();  // User's input is automatically converted to an int
        int age = 2020 - yearOfBirth;
        //System.out.println("Your age is: " + age);

        // Without amendments, typing year of birth and pressing enter because two different inputs
        // and the name of the user becomes 'enter'. This is because 'enter' is experienced
        // as a line separator and directly feeds into next scanner call.

        scanner.nextLine();  // Handle next line character (enter key - line separator)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();  // read a line of input from the console

        //System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age + " and your name is: " + name);
        // recommended to close scanner when it is no longer needed to release storage

        scanner.close();

         */

        // ErrorHandled.UserInput();
        // SumUserInput.sumTenInputs();
        // MinMaxChallenge.printMinMax();
        InputCalculator.inputThenPrintSumAndAverage();
    }
}
