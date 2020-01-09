package gram.william;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void printMinMax() {
        Scanner scanner = new Scanner(System.in);
        int inputInt = 0;
        int min = 0;
        int max = 0;
        boolean isValid = true;
        while (isValid) {

            System.out.println("Enter integer to continue or a letter to finish");
            isValid = scanner.hasNextInt();
            if (!isValid) {
                System.out.println("You have quit the program.");
            } else {
                inputInt = scanner.nextInt();
                if (inputInt < min) min = inputInt;
                if (inputInt > max) max = inputInt;
                System.out.println("Preliminary min is: " + min +
                        ", and preliminary max is: " + max);
            }
            scanner.nextLine();
        }
        System.out.println("Final min is: " + min + ", and final max is: " + max);
        scanner.close();
    }
}
