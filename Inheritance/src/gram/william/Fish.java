package gram.william;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    /*
    public Fish(
            String name, int brain, int body, int size,
            int weight, int gills, int eyes, int fins
    ) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
     */

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        // Fish don't generally sleep, rather they rest
    }

    private void moveMuscles() {
        System.out.println("this.moveMuscles called");
    }
    private void moveBackFin() {
        System.out.println("this.moveBackFin called");
    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
