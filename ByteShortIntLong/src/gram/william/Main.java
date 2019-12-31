package gram.william;

public class Main {

    public static void main(String[] args) {
        
        // int occupies 32 bits - "has a width of 32"
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // OVERFLOW: to the maximum int let's the number restart from the bottom
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

        // UNDERFLOW: Subtracting from the min int let's the number restart from the top
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // Cannot directly assign a number that is too large / small
        // int myMaxIntTest = 2147483648;

        // Another valid, but unusual way to represent numbers
        int myOtherNumber = 2_147_483_647;
        System.out.println("Strange typing is allowed: " + myOtherNumber);

        // byte has occupies 8 bits - "has a width of 8"
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        // short occupies 16 bits - "has a width of 16"
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);
        
        // Technically, we need to put an l at the end of the number 100 should be 100l or 100L
        // Without the L, the number is first treated as integer (and thus must be within
        // int's range) and then converts it to a long afterwards.
        long myLongValue = 100L;
        // long myWrongLong = 2_147_483_648;  // Won't work, int to be converted is outside int's range

        // long occupies 64 bits - "has a width of 64"
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        // CASTING //
        // Produces an error - we know, we get a number that fits into byte, so we need to tell Java that
        // byte myNewByteValue = (myMinByteValue / 2);

        // Treat the variable af (byte) as a byte, not an integer
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // Without the short, Java assumes an int type, which must be converted
        short myNewShortValue = (short) (myMinShortValue / 2);

        /*
        Challenge:
        (a) Create a byte variable - any number will do
        (b) Same for short
        (c) Same for int
        (d) Same for long - must be 50_000 + 10*sum(byte, short, int)
         */

        byte someByteValue = 50;
        short someShortValue = 50;
        int someIntValue = 50;

        // No need to do casting, the maximum int will always fit inside long
        // Java reads multiline code
        long challengeLongValue = 50000L + 10L *
                (someByteValue + someShortValue + someIntValue);
        System.out.println(challengeLongValue);

        // here we do need to do short.
        short shortTotal = (short) (1000 + 10 * (someByteValue + someShortValue + someIntValue));
    }
}
