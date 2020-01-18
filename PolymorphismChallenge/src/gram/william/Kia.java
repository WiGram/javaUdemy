package gram.william;

public class Kia extends Car {
    public Kia(int cylinders, int wheels, String colour) {
        super(cylinders, wheels, colour);
    }

    @Override
    public void accelerate(int acceleration) {
        super.accelerate(acceleration);
        System.out.println("A pedestrian just passed while the car was accelerating");
    }
}
