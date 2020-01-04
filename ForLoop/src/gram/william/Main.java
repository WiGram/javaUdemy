package gram.william;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        /*
        for (init; termination; increment) {

        }
         */
        for (int i=2; i<6; i++) {
            // I don't need to cast, as Java knows to turn the int into a double
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, (double) i));
        }

        for (double i=2.0; i<6.0; i+=0.5) {
            // I don't need to cast, as Java knows to turn the int into a double
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        for (int i=2; i<6; i++) {
            // I don't need to cast, as Java knows to turn the int into a double
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i=8; i>1; i--) {
            // I don't need to cast, as Java knows to turn the int into a double
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        for (int i=3; i < 50; i++) {
            boolean isPrim = isPrime(i);
            if (isPrim) System.out.println(i + " is a prime: " + isPrim);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }
}
