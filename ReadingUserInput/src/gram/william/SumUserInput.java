package gram.william;

import java.util.Scanner;

public class SumUserInput {
    public static void sumTenInputs() {
        Scanner scanner = new Scanner(System.in);
        int inputs = 1;
        int inputSum = 0;
        while (inputs < 11) {

            System.out.println("Enter integer no. " + inputs + ": ");
            boolean inputIsInt = scanner.hasNextInt();

            if (!inputIsInt) {
                System.out.println("Value is not an int, type in int: ");
            } else {
                int userInt = scanner.nextInt();
                inputSum += userInt;
                inputs++;
            }
            System.out.println("Preliminary sum is: " + inputSum);

            scanner.nextLine();
        }
        System.out.println("Final sum is: " + inputSum);
        scanner.close();
    }
}
