package gram.william;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int largestPrime = 0;
        boolean isPrime = true;

        for (int i = 2; i <= number; i++) {

            if (number % i != 0) continue;
            if (i > (number / 2)) i = number;  // The only possible prime left is the number itself

            for (int j = 2; j<= i/2; j++) {
                if (i % j == 0) {
                    // If any number divides i with no remainder, break out.
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) largestPrime = i;
            isPrime = true;  // reset isPrime for next iteration
        }
        return largestPrime;
    }

    /*
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i < number) return false;
        }
        return true;
    }
     */
}
