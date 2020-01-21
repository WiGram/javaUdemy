package gram.william;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 17, 12, 0};
        System.out.println("Array = " + Arrays.toString(array));
        reverseArray(array);

        // more efficient!
        reverse(array);
    }

    public static void reverseArray(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] tmp = new int[array.length];
        for (int i = (array.length-1); i >= 0; i--) {
            tmp[i] = array[array.length-1-i];
        }
        System.out.println("Array = " + Arrays.toString(tmp));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length-1;
        int tmp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex-i] = tmp;
        }
        System.out.println("Array = " + Arrays.toString(array));
    }
}
