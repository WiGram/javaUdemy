package gram.william;

public class Main {

    public static void main(String[] args) {
        String time = getDurationString(72, 13);
        System.out.println(time);

        String newTime = getDurationString(72*60+13);
        System.out.println(newTime);

        String singleSeconds = getDurationString(5);
        System.out.println(singleSeconds);

        String errorTime = getDurationString(50, -10);
        System.out.println(errorTime);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int remainderMinutes = minutes % 60;
        int hours = (minutes - remainderMinutes) / 60;

        String hoursString = singleDigitsToDouble(hours);
        String minutesString = singleDigitsToDouble (remainderMinutes);
        String secondsString = singleDigitsToDouble(seconds);

        return hoursString + "h " + minutesString + "m " + secondsString + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int remainderSeconds = seconds % 60;
        int minutes = (seconds - remainderSeconds) / 60;
        return getDurationString(minutes, remainderSeconds);
    }

    public static String singleDigitsToDouble(int units) {
        return (units < 10) ? "0" + units : Integer.toString(units);
    }

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
}
