package gram.william;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {


        boolean divByFour = year % 4 == 0;  // If not div by 4: never leap year
        boolean notDivByHundred = !(year % 100 == 0);  // If this or div by 400: leap year
        boolean divByFourHundred = year % 400 == 0;

        if (year < 1 || year > 9999) {
            return false;
        }

        return (divByFour & notDivByHundred) || divByFourHundred;
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = -1;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return daysInMonth;
        }
        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear && month == 2) {
            daysInMonth = 29;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    daysInMonth = 28;
                    break;
                default:
                    break;
            }
        }
        return daysInMonth;
    }
}
