package gram.william;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // int provides an integer, int[] provides an array of integers
	    int[] myVariable;

	    // assign a variable with 10 elements
	    myVariable = new int[10];

        // Assignment into element 6 (starts at index zero)
        myVariable[5] = 50;
        System.out.println(myVariable);
        System.out.println(myVariable[5]);

        // Or do it in one step:
        double[] myDoubleArray = new double[10];

        // If we know the values we'd like to assign into the array: (note done at initialisation)
        double[] newDoubleArray = {0.1, 1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0};
        System.out.println(newDoubleArray[1]);

        for(int i=0; i<10; i++) {
            System.out.println("Element " + i + ", value is " + newDoubleArray[i]);
        }

        // or

        for(int i=0; i<myVariable.length; i++) {
            myVariable[i] = (int) (Math.random()*100);
        }

        printArray(myVariable);

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    private static Scanner scanner = new Scanner(System.in);

    // We want to generate an array of integers
    public static int[] getIntegers(int number) {
        // \r forces to go to new line.
        System.out.println("Enter " + number + " integer values. \r");

        // The method input >number< initiates an array of integers of that length
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        // We want to make sure a double is returned, hence we need to cast both numerator and denominator
        return (double) sum / (double) array.length;
    }
}
