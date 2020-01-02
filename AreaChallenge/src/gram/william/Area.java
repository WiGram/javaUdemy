package gram.william;

public class Area {

    public static double area(double radius) {
        if (radius < 0) return INVALID_VALUE;

        return radius * radius * Math.PI;
    }

    public static double area(double length, double height) {
        if (length < 0 || height < 0) return INVALID_VALUE;

        return length * height;
    }

    private static final double INVALID_VALUE = -1.0d;
}
