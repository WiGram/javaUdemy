package gram.william;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        // this. not needed as no argument is passed and hence no ambiguity towards height
        return height;
    }
    public double getVolume() {
        return this.getArea() * this.height;
    }
}
