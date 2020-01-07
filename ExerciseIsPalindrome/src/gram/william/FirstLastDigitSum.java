package gram.william;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        String nText = Integer.toString(number);
        int power = nText.length();

        int lastDigit = number % 10;
        int firstDigit = (int) (number / Math.pow(10d, (double) power - 1d));
        System.out.println("LastDigit is = " + lastDigit +
                " and firstDigit is = " + firstDigit +
                " and the sum is = " + (lastDigit + firstDigit));
        return firstDigit + lastDigit;
    }

    public static int sumLoop(int number) {
        if (number < 0) return -1;
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return number + lastDigit;
    }
}
