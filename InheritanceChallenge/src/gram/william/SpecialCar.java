package gram.william;

public class SpecialCar extends Car {
    private int roadServiceMonths;

    public SpecialCar(int direction, int speed, int roadServiceMonths) {
        super("Outlander", "4WD", direction, speed, 5, 5, false, 6);
        this.roadServiceMonths = roadServiceMonths;
    }
}
