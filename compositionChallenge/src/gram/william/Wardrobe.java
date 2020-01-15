package gram.william;

public class Wardrobe {
    private String producer;
    private int width;
    private int height;
    private int depth;
    private boolean open;

    public Wardrobe(String producer, int width, int height, int depth, boolean open) {
        this.producer = producer;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.open = open;
    }

    public void openWardrobe() {
        System.out.println("Wardrobe is open");
        this.open = true;
    }

    public void closeWardrobe() {
        System.out.println("Wardrobe is closed");
        this.open = false;
    }
}
