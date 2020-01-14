package gram.william;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private boolean isManual;
    private int gears;
    private int currentGear;

    public Car(String name, String type, int wheels, int doors, boolean isManual, int gears) {
        super(name, type);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeSpeed(int speed, int direction) {
        super.move(speed, direction);
        System.out.println("Car.changeSpeed(): Speed " + speed + " and direction " + direction);
    }
}
