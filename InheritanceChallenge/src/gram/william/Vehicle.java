package gram.william;

public class Vehicle {
    private String name;
    private String type;
    private int direction;
    private int speed;

    public Vehicle(String name, String type, int direction, int speed) {
        this.name = name;
        this.type = type;
        this.direction = direction;
        this.speed = speed;
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.direction + " degrees.");
    }

    public void move(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at " + this.speed + " in direction " + this.direction);
    }

    public void stop() {
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }
}
