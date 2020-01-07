package gram.william;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        } else if (number == 0) {
            System.out.println("Zero");
            return;
        }
        String print = "";
        int digitCount = getDigitCount(number);
        int reverseNum = reverse(number);
        int revCount = getDigitCount(reverseNum);
        int digitDiff = digitCount - revCount;

        while (reverseNum > 0) {
            int lastDigit = reverseNum % 10;
            switch (lastDigit) {
                case 0:
                    print += "Zero";
                    break;
                case 1:
                    print += "One";
                    break;
                case 2:
                    print += "Two";
                    break;
                case 3:
                    print += "Three";
                    break;
                case 4:
                    print += "Four";
                    break;
                case 5:
                    print += "Five";
                    break;
                case 6:
                    print += "Six";
                    break;
                case 7:
                    print += "Seven";
                    break;
                case 8:
                    print += "Eight";
                    break;
                case 9:
                    print += "Nine";
                    break;
            }
            reverseNum /= 10;
            if (reverseNum > 0) print += " ";
        }

        for (int i = 1; i <= digitDiff; i++) {
            print = print + " Zero";
        }
        System.out.println(print);
    }


    public static int reverse(int number) {
        int remainder = 0;
        int reverseNumber = 0;
        int digitCount = getDigitCount(number);

        for (int i = 1; i <= digitCount; i++){
            remainder = (int) ((number % 10) * Math.pow(10d, digitCount-i));
            reverseNumber += remainder;
            number /= 10;
        }
        return reverseNumber;
    }

    private static int getDigitCount(int number) {
        if (number < 0) return -1;
        return Integer.toString(Math.abs(number)).length();
    }
}
