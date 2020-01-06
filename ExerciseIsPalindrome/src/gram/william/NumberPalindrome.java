package gram.william;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int oldNum = Math.abs(number);
        number = oldNum;

        int reverse = 0;
        int lastDigit = 0;

        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = (number - lastDigit) / 10;  // should work as number is an int
        }
        System.out.println("Reverse of " + oldNum + " is: " + reverse);
        System.out.println(oldNum + " is a Palindrome is: " + (oldNum == reverse));

        return oldNum == reverse;
    }
}
