package gram.william;

public class SpecialCar extends Car {
    private int roadServiceMonths;

    public SpecialCar(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, false, 6);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newSpeed = getSpeed() + rate;

        if (newSpeed <= 0) {
            newSpeed = 0;
            stop();
        } else if (newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed <= 20) {
            changeGear(2);
        } else if (newSpeed <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getDirection());
        }
    }
}
