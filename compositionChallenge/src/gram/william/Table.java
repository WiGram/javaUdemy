package gram.william;

public class Table {
    private String shape;
    private int legs;
    private boolean tidy;

    public Table(String shape, int legs, boolean tidy) {
        this.shape = shape;
        this.legs = legs;
        this.tidy = tidy;
    }

    public void tidyTable() {
        System.out.println("Table is tidy");
        this.tidy = true;
    }

    public void useTable() {
        System.out.println("Table is in use and not tidy");
        this.tidy = false;
    }
}
