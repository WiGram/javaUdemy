package gram.william;

import java.math.BigDecimal;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {
        // Casting a 1000-fold number to an int removes trailing decimals
        // Casting back to a double divided by 1,000 effectively truncates the double
        numberOne = (double) (int) (numberOne * 1000)/ 1000d;
        numberTwo = (double) (int) (numberTwo * 1000)/ 1000d;

        return numberOne == numberTwo;
    }
}
