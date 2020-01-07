package gram.william;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!(isValid(n1) && isValid(n2) && isValid(n3))) return false;
        return ( (n1 % 10) == (n2 % 10) ||
                (n1 % 10) == (n3 % 10) ||
                (n2 % 10) == (n3 % 10));
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
