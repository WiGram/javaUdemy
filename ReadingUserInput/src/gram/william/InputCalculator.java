package gram.william;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int inputInt = 0;
        int counter = 0;
        int sum = 0;
        long avg = 0;
        boolean isValid = true;

        while (isValid) {
            System.out.println("Type integer to continue, character to quit.");
            isValid = scanner.hasNextInt();
            if (!isValid) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
            } else {
                inputInt = scanner.nextInt();
                counter++;
                sum += inputInt;
                avg = Math.round((double) sum / counter);
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
