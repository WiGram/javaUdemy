package gram.william;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // Arrays are reference types
        int[] myIntArray = new int[5];
        // A reference holds an address to an object, but not the object itself.
        //   we are never accessing the placement in memory directly, only a reference to it

        int[] anotherArray = myIntArray;
        // We have now made a new reference to the same address in memory.
        //   without the new-keyword we have never made a new object, i.e.
        //   we are looking at an already established place in memory - a reference

        // Every element in the array is returned as a string.
        //    a new string with every element as a string is returned separated by commas.
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        // Since there is only one copy of the array, and both our arrays reference to that same
        // address, a change to one is equal to a change in the address and any arrays that point
        // to this position in memory.
        System.out.println("myIntArray, after change = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray, after change = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);

        // A method cannot modify a reference itself.
        //    it can only dereference an array / reinitialise an array
        System.out.println("myIntArray, after modify = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray, after modify = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;

        // Dereference / reinitialise the array...
        //   this should change the arrays referenced to the old block
        //   array is changed locally, but not returned, so it doesn't change
        //   anything outside the method. Not even the inputted array.
        array = new int[] {1, 2, 3, 4, 5};
    }
}
