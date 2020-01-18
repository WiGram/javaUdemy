package gram.william;

public class Car {
    private int cylinders;
    private int wheels;
    private int speed;
    private boolean isEngineRunning = false;
    private String colour;

    public Car(int cylinders, int wheels, String colour) {
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.colour = colour;
    }

    public void startEngine() {
        if (this.isEngineRunning) {
            System.out.println("Engine is already on.");
        } else {
            System.out.println("Engine running");
            this.isEngineRunning = true;
        }

    }

    public void stopEngine() {
        if (!this.isEngineRunning) {
            System.out.println("Engine is already off.");
        } else {
            System.out.println("Engine is off");
            this.isEngineRunning = false;
        }
    }

    public void accelerate(int acceleration) {
        if (acceleration < 0) {
            System.out.println("Input a positive number for acceleration");
        } else {
            if (!this.isEngineRunning) {
                System.out.println("Engine was off, it is turned on automatically");
                this.isEngineRunning = true;
            }
            System.out.println("Your speed was " + this.speed + " and you accelerate by " + acceleration);
            this.speed += acceleration;
            System.out.println("Your new speed is " + this.speed);
        }
    }

    public String getColour() {
        return colour;
    }

    public void brake(int brakeAmount) {
        if (brakeAmount < 0) {
            System.out.println("Input positive number for bakeAmount");
        } else {
            System.out.println("Your speed was " + this.speed + " and you break by " + brakeAmount);
            if (this.speed - brakeAmount < 0) {
                this.speed = 0;
            } else {
                this.speed -= brakeAmount;
            }
            System.out.println("Your new speed is " + this.speed);
        }
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }
}
