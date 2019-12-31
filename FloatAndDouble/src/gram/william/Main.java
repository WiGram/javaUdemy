package gram.william;

public class Main {

    public static void main(String[] args) {
	// Float is a single precision number - occupies 32 bits
    // Double is a double precision number - occupies 64 bits (8 bytes)
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5f;  // Good practice, but unnecessary to provide f
        double myDoubleValue = 5d;  // Good practice, but unnecessary to provide d

        // float mySecondFloatValue = 5.25;  // Won't work
        float mySecondFloatValue = (float) 5.25;  // Won't work without CASTING.
        float myThirdFloatValue = 5.25f;  // Less code to do the same CASTING

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        System.out.println("MyIntValue = " + myIntValue/3);  // Int throws away the remainder - no rounding
        System.out.println("MyFloatValue = " + myFloatValue/3f);  // Again 'f' is not necessary, but good practice
        System.out.println("MyDoubleValue = " + myDoubleValue/3d);  // And 'd' is not necessary, but good practice

        /*
         Doubles are preferable to floats:
         (1) faster to process for most modern computers, even if they consume more space.
             Built-in functionality at the chip level to deal with doubles faster, not so with floats
         (2) Math libraries are made to work with doubles rather than floats due to precision
         (3) Java treats doubles as the default number for decimal numbers, not floats.
         */

        /*
        Challenge:
        (1) Variable to store number of pounds to be converted into kgs
        (2) Calculate the result and store into a second variable
        (3) Print out the result
         */

        double myPounds = 10d;
        double myKgs = myPounds * 0.45359237d;  // Again not necessary, the decimal is automatically detected as double
        System.out.println("10 pounds is equal to: " + myKgs);

        // Precise calculations (such as in finance) we would need the "BigDecimal" type, not doubles.
    }
}
