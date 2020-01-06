package gram.william;

public class SumDigitsChallenge {
    public static int sumDigits(int number) {
        System.out.println("Sum of digits of " + number + " is ");
        if (number < 10) {
            return -1;
        }
        int least = number % 10;
        int sumOfDigits = least;
        while (number >= 10) {
            number = (number - least) / 10;
            least = number % 10;
            sumOfDigits += least;
        }
        System.out.println(sumOfDigits);
        return sumOfDigits;
    }
}
