package gram.william;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Static: allows to use scanner without creating separate instances of the main class
    // Private: Inaccessible to other classes. Encapsulates the data. Good idea, even if we
    //   are not creating other classes.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);

        int min = findMin(array);
        System.out.println("Minimum is: " + min);
    }

    public static int[] readIntegers(int integerAmount) {

        int[] myArray = new int[integerAmount];

        System.out.println("Enter " + integerAmount + " integers to go into your array.");
        for (int i=0; i<integerAmount; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            myArray[i] = number;
        }

        return myArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
