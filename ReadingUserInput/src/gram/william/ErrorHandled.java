package gram.william;

import java.util.Scanner;

public class ErrorHandled {
    public static void UserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        // Handle if the next input entered is a number
        //   if the input qualifies as an int, a boolean value of true is returned, else false
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();  // handle next line character (enter key)

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name +
                        ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }
}
