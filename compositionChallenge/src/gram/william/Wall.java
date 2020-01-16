package gram.william;

public class Wall {
    private String direction;
    private String colour;
    private int height;
    private int length;

    public Wall(String direction, String colour, int height, int length) {
        this.direction = direction;
        this.colour = colour;
        this.height = height;
        this.length = length;
    }

    public int area() {
        return this.height * this.length;
    }
}
