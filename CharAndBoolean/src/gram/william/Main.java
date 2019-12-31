package gram.william;

public class Main {

    public static void main(String[] args) {

        // char ('') is different to a string ("") - can only store single character
        char myChar = 'D';

        // usually to store last key pressed in a game, website etc., and legacy from when computers had less memory
        // char occupies 2 bytes (16 bits - width of 16)
        // 2 bytes rather than 1, because it can store unicode characters

        // Find unicode characters at unicode-table.com/
        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        System.out.println(isCustomerOverTwentyOne);
    }
}
