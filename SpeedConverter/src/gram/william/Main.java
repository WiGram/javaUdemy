package gram.william;

public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConversion(10.5);

        // MegaBytesKiloBytes.printMegaBytesAndKiloBytes(2500);

        /*
        boolean wakeUp = BarkingDog.shouldWakeUp(true, 4);
        System.out.println("It is " + wakeUp + " that we should wake up.");
        */

        /*
        int year = -1600;
        boolean isLeapYear = LeapYear.isLeapYear(year);
        System.out.println("It is " + isLeapYear + " that " + year + " is a leap year.");
        */

        /*
        double numberOne = 3.1756;
        double numberTwo = 3.1755;
        boolean areIdentical = DecimalComparator.areEqualByThreeDecimalPlaces(numberOne, numberTwo);
        System.out.println(
                "It is " + areIdentical + " that " + numberOne +
                        " is identical to " + numberTwo + " when " +
                        "truncated to three decimal places."
        );
        */

        /*
        int firstInt = 1;
        int secondInt = -1;
        int checkSum = 0;
        boolean areEqual = EqualSumChecker.hasEqualSum(firstInt, secondInt, checkSum);
        System.out.println(
            "It is " + areEqual + " that " + firstInt + " + " + secondInt + " = " +
                    checkSum + "."
        );
        */

        /*
        int optOne = 13;
        int optTwo = 21;
        int optThree = 99;

        boolean isTeen = TeenNumberChecker.hasTeen(optOne, optTwo, optThree);
        System.out.println(
                "It is " + isTeen + " that either " + optOne + " or " +
                        optTwo + " or " + optThree + " are between 13 " +
                        "and 19 (inclusive)."
        );
        */
    }
}
