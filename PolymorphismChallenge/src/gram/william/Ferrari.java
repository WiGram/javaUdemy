package gram.william;

public class Ferrari extends Car {
    private String model;

    public Ferrari(int cylinders, int wheels, String model, String colour) {
        super(cylinders, wheels, colour);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void accelerate(int acceleration) {
        super.accelerate(acceleration);
        System.out.println("The acceleration was insane!");
    }
}
