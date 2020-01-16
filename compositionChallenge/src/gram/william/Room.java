package gram.william;

public class Room {
    private Table table;
    private Wardrobe wardrobe;
    private TV tv;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    public Room(Table table, Wardrobe wardrobe, TV tv, Wall wall1, Wall wall2, Wall wall3, Wall wall4) {
        this.table = table;
        this.wardrobe = wardrobe;
        this.tv = tv;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
    }

    public void tidyRoom() {
        this.table.tidyTable();
        this.wardrobe.closeWardrobe();
        this.tv.turnOff();
    }

    public TV getTV() {
        return this.tv;
    }

    public int getDimension(int wallNumber) {
        if (wallNumber < 1 || wallNumber > 4) {
            System.out.println("No such wall number, choose between 1 and 4 inclusive");
            return -1;
        } else if (wallNumber == 1){
            System.out.println(this.wall1.area());
            return this.wall1.area();
        } else if (wallNumber == 2){
            System.out.println(this.wall2.area());
            return this.wall2.area();
        } else if (wallNumber == 3) {
            System.out.println(this.wall3.area());
            return this.wall3.area();
        } else {
            System.out.println(this.wall4.area());
            return this.wall4.area();
        }
    }
}
