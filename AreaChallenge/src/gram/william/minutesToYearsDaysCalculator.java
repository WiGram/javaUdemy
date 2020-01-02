package gram.william;

public class minutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long remMinutes = minutes % 60;
            long hours = (minutes - remMinutes) / 60;
            long remHours = hours % 24;
            long days = (hours - remHours) / 24;
            long remDays = days % 365;
            long years = (days - remDays) / 365;

            String yearString = singleToDouble(years);
            String dayString = singleToDouble(remHours);
            String minString = singleToDouble(minutes);

            System.out.println(minString + " min = " + yearString + " y and " + dayString + " d");
        }
    }

    private static String singleToDouble(long units) {
        if (units < 10) {
            return "0" + Long.toString(units);
        }
        return Long.toString(units);
    }
}
