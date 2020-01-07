package gram.william;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int evenSum = 0;
        int remainder = number % 10;
        while (number > 0) {
            System.out.println("Number is = " + number);
            remainder = number % 10;
            System.out.println("remainder is = " + remainder);
            if (remainder % 2 == 0) evenSum += remainder;
            System.out.println("evenSum is = " + evenSum);
            number /= 10;
        }

        return evenSum;
    }
}
