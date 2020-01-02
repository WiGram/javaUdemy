package gram.william;

public class Main {

    public static void main(String[] args) {
        double circle_area = Area.area(1);
        System.out.println(circle_area);

        double rect_area = Area.area(2, 4);
        System.out.println(rect_area);

        minutesToYearsDaysCalculator.printYearsAndDays(3);
        minutesToYearsDaysCalculator.printYearsAndDays(35490874);

        IntEqualityPrinter.printEqual(3, 4, 4);
        boolean catPlay = PlayingCat.isCatPlaying(true, 45);
        System.out.println(catPlay);
    }
}
