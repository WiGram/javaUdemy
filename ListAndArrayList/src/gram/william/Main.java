package gram.william;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        printArray(baseData);
    }

    private static void getInput()
    {
        for (int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    // base way of changing the array size
    private static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray()
    {
        int[] original = baseData;  // copy

        // reinitialise the array
        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }
}
