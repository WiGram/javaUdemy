package gram.william;

public class LeapYear {
    public static boolean isLeapYear(int year) {

        boolean divByFour = year % 4 == 0;  // If not div by 4: never leap year
        boolean notDivByHundred = !(year % 100 == 0);  // If this or div by 400: leap year
        boolean divByFourHundred = year % 400 == 0;

        if (year < 1 || year > 9999) {
            return false;
        }
        return (divByFour & notDivByHundred) || divByFourHundred;
    }
}
