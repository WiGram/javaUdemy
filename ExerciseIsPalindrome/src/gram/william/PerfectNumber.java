package gram.william;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumDivs = 0;
        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) sumDivs += i;
        }
        return sumDivs == number;
    }
}
