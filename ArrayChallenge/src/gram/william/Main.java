package gram.william;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] testArray = getIntegers(5);
        printArray(testArray);
        int[] testSort = sortIntegers(testArray);
        printArray(testSort);
    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int arrayLength) {
        System.out.println("Enter " + arrayLength + " integers to go into your array.");

        int[] myArray = new int[arrayLength];

        for (int i=0; i<arrayLength; i++) {
            myArray[i] = scanner.nextInt();
        }

        return myArray;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Array index " + i + " has value " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        int oldArrayNumber = 0;
        int oldMax = 0;
        int tmpLength = array.length;
        int[] sortedArray = new int[array.length];
        Arrays.fill(sortedArray, Integer.MIN_VALUE);

        for (int i = 0; i<array.length; i++) {
            oldArrayNumber = array[i];
            for (int j = tmpLength-1; j >= 0; j--) {
                if (oldArrayNumber > sortedArray[j]) {
                    oldMax = sortedArray[j];
                    sortedArray[j] = oldArrayNumber;
                    oldArrayNumber = oldMax;
                }
            }
        }
        return sortedArray;
    }

    public static int[] otherSortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }

        // int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
